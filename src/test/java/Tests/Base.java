package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
BrowserFactory browserFactory= new BrowserFactory();
final WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://ndosiautomation.co.za/");
HomePage homePage = PageFactory.initElements(driver, HomePage.class);
LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

}
