package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage {

    WebDriver driver ;
  @FindBy(id = "inventory-title")
    WebElement inventoryTitle_id;

  public InventoryPage(){
      this.driver=driver;
  }


}
