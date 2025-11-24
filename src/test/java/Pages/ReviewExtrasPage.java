package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewExtrasPage {
    WebDriver driver;

    @FindBy(id = "shipping-option-express")
    WebElement shippingExpress_id;


    public ReviewExtrasPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ShippingOptionExpress (){
        shippingExpress_id.click();
    }

}

