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

    public WebAutomationAdvance() {
      this.driver=driver;
  }

    public void verifyInventoryHeaderIsDisplayed(){
             new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(inventoryTitle_id));
    }

    public void selectBrandType() {
         deviceDropDown_id.sendKeys("Tablet");

     }

    public void selectTableBrand() {


    }
}
