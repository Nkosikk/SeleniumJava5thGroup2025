package Tests;

import Pages.HomePage;
import Pages.LearningMaterialPage;
import Pages.LoginPage;
import Pages.WebAutomationAdvancePage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.ndosiautomation.co.za/");
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
    LearningMaterialPage learningMaterialPage = PageFactory.initElements(driver, LearningMaterialPage.class);
    WebAutomationAdvancePage webAutomationAdvancePage = PageFactory.initElements(driver, WebAutomationAdvancePage.class);

}
