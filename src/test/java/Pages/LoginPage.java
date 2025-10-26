package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "login-email")
    WebElement loginEmail_Id;

    @FindBy(id = "login-password")
    WebElement Password_Id;

    @FindBy(id = "login-submit")
    WebElement SubmitButton;

    //constructur
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterLoginEmailId(String email) {
        new WebDriverWait(
                driver, Duration.ofSeconds(10)).until(visibilityOf(loginEmail_Id));
                loginEmail_Id.sendKeys(email);}
    public void enterPassword (String password) {Password_Id.sendKeys(password);}
    public void ClickSubmit(){SubmitButton.click(); }
}
