package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class RegistrationPage {

    WebDriver driver;

    @FindBy(id = "signup-toggle")
    WebElement signUpToggle_id;
    @FindBy(id = "register-firstName")
    WebElement firstName_id;
    @FindBy(id = "register-lastName")
    WebElement lastName_id;
    @FindBy(id = "register-email")
    WebElement registerEmail_id;
    @FindBy(id = "register-password")
    WebElement registerPassword_id;
    @FindBy(id = "register-confirmPassword")
    WebElement confirmPassword_id;
    @FindBy(id = "register-submit")
    WebElement registerSubmit_id;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignUp() {signUpToggle_id.click();
    }

    public void enterFirstName(String firstName) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstName_id));
        firstName_id.sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        lastName_id.sendKeys(lastName);
    }
    public void enterRegisterEmail(String email) {
        registerEmail_id.sendKeys(email);
    }
    public void enterRegisterPassword(String password) {
        registerPassword_id.sendKeys(password);
    }
    public void enterConfirmPassword(String password) {
        confirmPassword_id.sendKeys(password);
    }
    public void clickRegisterSubmit() {
        registerSubmit_id.click();
    }



}

