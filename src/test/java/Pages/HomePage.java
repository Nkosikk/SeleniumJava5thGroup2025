package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;
//Locator to verify that you are on the homepage
    @FindBy(id = "overview-hero")
    WebElement homepageTitle_id;

//
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    // verify method is displayed
    public void verifyHomePageIsDisplayed(){
        homepageTitle_id.isDisplayed();
    }

}
