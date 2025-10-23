package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage {
    WebDriver driver;

    @FindBy(id="login-email") WebElement loginEmail_id;
    @FindBy(id="login-password") WebElement loginPassword_id;
    @FindBy(id="login-submit") WebElement loginSubmit_id;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterLoginEmail(){
        loginEmail_id.sendKeys("deez@gmail.com");
    }
    public void enterPasswordId(){
        loginPassword_id.sendKeys("012345678");
    }
    public void clickLogin(){
        loginPassword_id.click();}
}

