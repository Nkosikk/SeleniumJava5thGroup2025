package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class WebAutomationAdvancePage {

    WebDriver driver;

    @FindBy(id = "inventory-title")
    WebElement inventoryHeader_id;

    @FindBy(id = "deviceType")
    WebElement deviceTypeDropDown_id;

    @FindBy(id = "brand")
    WebElement tabletBrand_id;

    //@FindBy(id = "storage-64GB")
    //WebElement storage64GB.id;
    @FindBy(id = "color")
    WebElement deviceColor_id;

    @FindBy(id = "address")
    WebElement enterAddress_id;

    public WebAutomationAdvancePage(WebDriver driver){
        this.driver=driver;
    }

    public void verifyInventoryHeaderIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(inventoryHeader_id));
        inventoryHeader_id.isDisplayed();
    }
    public void selectDeviceType(String deviceType){
        deviceTypeDropDown_id.sendKeys(deviceType);
    }

    public void selectTabletBrand(String deviceBrand){
        tabletBrand_id.sendKeys(deviceBrand);
    }
    //public void selectStorageSize ( String storageSize){
      //  storage64GB.id.
   // }
    public void selectDeviceColor(String deviceColor){
        deviceColor_id.sendKeys(deviceColor);
    }
    public void enterAddressDetails(String address) {
        enterAddress_id.sendKeys(address);

    }






}
