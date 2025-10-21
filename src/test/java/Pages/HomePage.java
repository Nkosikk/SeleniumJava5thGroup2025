package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;

    @FindBy(id = "overview-hero") WebElement HomepageTitle_id;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public void verifyHomePageIsDisplayed(){
        HomepageTitle_id.isDisplayed();
    }
}
