package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

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

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterLoginEmail(String email) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginEmail_id));
        loginEmail_id.sendKeys(email);
    }

    public void enterPasswordId(String password) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginPassword_id));
        loginPassword_id.sendKeys(password);
    }

    public void clickLogin() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginSubmit_id));
        loginSubmit_id.click();
    }

}

