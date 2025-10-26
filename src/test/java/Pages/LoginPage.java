package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public void enterLoginEmailId() { loginEmail_Id.sendKeys("oraesima@gmail.com");}
    public void enterPassword () {Password_Id.sendKeys("oteng-2012");}
    public void ClickSubmit(){SubmitButton.click(); }
}
