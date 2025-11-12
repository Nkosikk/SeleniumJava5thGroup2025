package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.WebAutomationAdvancePage;
import Pages.LoginToLearningMaterial;
import Utils.BrowserFactory;
import Utils.ReadFromFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.ndosiautomation.co.za/");

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
    LoginToLearningMaterial learningMaterialPage = PageFactory.initElements(driver, LoginToLearningMaterial.class);
    WebAutomationAdvancePage webAutomationAdvancePage = PageFactory.initElements(driver, WebAutomationAdvancePage.class);
    TakeScreenshot takeScreenshot;
    ReadFromFile readFromFile = new ReadFromFile();

}
