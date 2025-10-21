package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;

    @FindBy(id = "overview-hero")
    WebElement homepageTitle_id;

    @FindBy(id = "nav-btn-practice")
    WebElement LearningMaterial_id;

    @FindBy(id = "login-email")
    WebElement enterEmail_id;



    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public void verifyHomePageIsDisplayed(){
        homepageTitle_id.isDisplayed();
    }

    public void clickLearningMaterial(){
        LearningMaterial_id.click();
    }
    public void enterEmail (){ enterEmail_id.sendKeys("leehlenkambule@gmail.com");
    }





}
