package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver Driver;

    @FindBy(id = "login-heading")
    WebElement LoginPageTitle_id;

    @FindBy(id = "login-email")
    WebElement EmailField_id;

    @FindBy(id = "login-password")
    WebElement PasswordField_id;

    @FindBy(id = "login-submit")
    WebElement LoginSubmit_id;


  public LoginPage(WebDriver driver){
      this.Driver=driver;
  }

    public void VerifyLoginPageIsDisplayed (){
    LoginPageTitle_id.isDisplayed();
    }

    public void enterEmail (){
        EmailField_id.click();
        EmailField_id.sendKeys("kb@gmail.com");
    }

    public void enterPassword(){
        PasswordField_id.click();
        PasswordField_id.sendKeys("D3vt3sting#");

    }

    public void LoginSelected(){
        LoginSubmit_id.click();

    }



}
