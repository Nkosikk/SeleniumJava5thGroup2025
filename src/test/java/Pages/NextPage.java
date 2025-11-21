package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NextPage {

    WebDriver driver;

    public NextPage( WebDriver driver){
        this.driver=driver;
    }

    @FindBy(id = "shipping-label")
    WebElement shippingLabel_id;

    @FindBy(id = "shipping-option-express")
    WebElement shippingOptionExpress_id;

    @FindBy(id = "warranty-option-1yr")
    WebElement warrantyOption1yr_id;

      @FindBy(id = "discount-code")
    WebElement discountCode_Id;

      @FindBy(id ="apply-discount-btn")
    WebElement applyDiscountBtn_id;

    @FindBy(id = "add-to-cart-btn")
    WebElement addToCartBtn_id;

    @FindBy(id = "cart-title")
    WebElement cartTile_id;

    @FindBy(id = "confirm-cart-btn")
    WebElement clickConfirmCartBtn_id;


}
