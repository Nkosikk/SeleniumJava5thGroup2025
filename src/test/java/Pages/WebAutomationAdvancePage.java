package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class WebAutomationAdvancePage {

    WebDriver driver;

    @FindBy(id = "inventory-title")
    WebElement inventoryHeader_id;


    @FindBy(id = "deviceType")
    WebElement deviceTypeDropDown_id;

    @FindBy(id = "brand")
    WebElement tabletBrand_id;

    @FindBy (id = "storage-64GB")
    WebElement SelectStorage_id;

    @FindBy (id = "white")
    WebElement SelectColour_id;

    @FindBy (id = "quantity")
    WebElement SelectQuantity_id;

    @FindBy (id = "address")
    WebElement EnterAddress_id;

    @FindBy (id = "color")
    WebElement SelectDeviceColour_id;

    @FindBy (id = "inventory-next-btn")
    WebElement SelectNextButton_id;

    @FindBy(id = "unit-price-value")
    WebElement UnitPrice_id;

    @FindBy(id = "quantity-label")
    WebElement Quantity_id;

    @FindBy (id = "subtotal-label")
    WebElement SubTotal_id;


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

    public void SelectDeviceStorage (){
        SelectStorage_id.click();
    }

    public void SelectDeviceQuantity() {

        SelectQuantity_id.clear();
        SelectQuantity_id.sendKeys("0");
    }

    public void EnterAddress(String address){
        EnterAddress_id.sendKeys(address);
    }

    public void SelectDeviceColour(String colour){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(SelectDeviceColour_id));

        SelectDeviceColour_id.sendKeys (colour);
    }

    public void SelectNextButton(){

        SelectNextButton_id.click();
    }

    public String getUnitPrice() {
        return UnitPrice_id.getText().trim();
    }


    public String getQuantityText() {
        return Quantity_id.getText().trim();
    }


    public String getQuantityInputValue() {
        return SelectQuantity_id.getAttribute("value").trim();
    }


    public String getSubtotal() {
        return SubTotal_id.getText().trim();
    }

















}
