package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class RegistrationPage {

    WebDriver driver;

    @FindBy (id = "signup-toggle")
    WebElement SelectSignUp_id;
    @FindBy (id = "register-firstName")
    WebElement SelectName_id;
    @FindBy (id = "register-lastName")
    WebElement RegisterLastName_id;
    @FindBy(id ="register-email")
    WebElement RegisterEmail_id;
    @FindBy (id = "register-password")
    WebElement RegisterPassword_id;
    @FindBy (id = "register-confirmPassword")
    WebElement RegisterConfirmPassword_id;
    @FindBy (id = "register-submit")
    WebElement CreateAccount_id;

    public RegistrationPage (WebDriver driver) {
        this.driver = driver;
    }

    public void SelectSignUp(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(SelectSignUp_id));
        SelectSignUp_id.click();
    }

    public void RegisterFirstName(String name ){
        SelectName_id.sendKeys(name);
    }

    public void RegisterLastName(String surname){
        RegisterLastName_id.sendKeys(surname);
    }

    public void RegisterEmail(String email){
        RegisterEmail_id.sendKeys(email);
    }

    public void RegisterPassword(String password){
        RegisterPassword_id.sendKeys(password);
    }

    public void RegisterConfirmPassword(String password){
        RegisterConfirmPassword_id.sendKeys(password);
    }

    public void SelectCreateAccount(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(CreateAccount_id));
        CreateAccount_id.click();
    }
}
