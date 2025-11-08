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
    WebElement loginEmail_id;
    @FindBy(id = "login-password")
    WebElement loginPassword_id;
    @FindBy(id = "login-submit")
    WebElement loginSubmit_id;
    @FindBy (id = "logout-button")
    WebElement logout_id;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterLoginEmail(String email) {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(loginEmail_id));
        loginEmail_id.sendKeys(email);
    }

    public void enterPasswordId(String password) {
        loginPassword_id.sendKeys(password);
    }

    public void clickLogin() {
        loginSubmit_id.click();
    }

    public void clickLogoutButton(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(logout_id));
        logout_id.click();
    }






}
