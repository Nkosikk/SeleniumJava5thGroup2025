package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
    static WebDriver driver;

    public static WebDriver StartBrowser(String browserChoice, String url){
        if (browserChoice.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if (browserChoice.equalsIgnoreCase("internetexplorer")){
            driver = new InternetExplorerDriver();
        }else if (browserChoice.equalsIgnoreCase("firefox")){
            driver = new SafariDriver();
        }else {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.getCurrentUrl();
        return driver;

    }

}
