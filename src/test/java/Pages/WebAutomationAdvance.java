package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class WebAutomationAdvance {

    WebDriver driver ;
  @FindBy(id = "inventory-title")
    WebElement inventoryTitle_id;

  @FindBy(id = "deviceType")
  WebElement deviceDropDown_id;

    @FindBy(id = "brand")
    WebElement brandType_id;

  @FindBy(id = "storage-128GB")
  WebElement storageOption_128GB_id;


  @FindBy(id = "color-black")
  WebElement colorOption_black_id;


  @FindBy(id = "quantity")
  WebElement quantity_id;


  @FindBy(id = "address")
  WebElement address_id;


  @FindBy(id = "inventory-next-btn")
  WebElement nextButton_id;


  @FindBy(id = "purchase-success-toast")
  WebElement OrderSuccessToast_id;

  @FindBy(id = "unit-price-label")
  WebElement unitPriceLabel_id;


  @FindBy(id = "quantity-label")
  WebElement getQuantity_id;


  @FindBy(id = "subtotal-label")
  WebElement subtotalLabel_id;


    public WebAutomationAdvance() {
      this.driver=driver;
  }

    public void verifyInventoryHeaderIsDisplayed(){
             new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(inventoryTitle_id));
    }

    public void selectDeviceType(String device ) {
        deviceDropDown_id.sendKeys("Tablet");

    }


    public void selectTabletBrand(String deviceBrand) {
        //.sendKeys(deviceBrand);
        brandType_id.sendKeys(deviceBrand);
    }


  public void selectStorageOption() {
    storageOption_128GB_id.click();
  }

  public void selectColorOption() {
    colorOption_black_id.click();
    }

  public void enterQuantity(String quantity) {
    //quantity.clear();
    quantity_id.sendKeys((quantity));
  }

  public void enterAddress(String address) {
    address_id.sendKeys(address);
  }

  public void clickNextButton() {






      nextButton_id.click();
  }

  public void verifyOrderSuccessToastIsDisplayed(){
      new WebDriverWait((driver),Duration.ofSeconds(10)).until(visibilityOf(OrderSuccessToast_id));
  }

}
