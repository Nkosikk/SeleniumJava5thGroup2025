package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class HomePage {

    WebDriver driver;

    @FindBy(id = "overview-hero")
    WebElement homepageTitle_id;

    @FindBy(id = "nav-btn-practice")
    WebElement LearningMaterial_id;

    @FindBy(id = "tab-btn-web")
    WebElement SelectWebAutomation_id;

    @FindBy(id = "logout-button")
    WebElement logout_id;

    @FindBy(id = "nav-btn-overview")
    WebElement SelectHomeButton_id;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void SelectWebAutomationButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(SelectWebAutomation_id));
        SelectWebAutomation_id.click();
    }

    public void verifyHomePageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(homepageTitle_id));
        homepageTitle_id.isDisplayed();
    }


    public void clickLearningMaterial(){
        LearningMaterial_id.click();

    }

    public void clickLogoutButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOf(logout_id));

    // Scroll into view just in case
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",  logout_id);

    // Force click with JavaScript (bypasses nav-bar overlap)
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();",  logout_id);
}






    public void ClickHomeButton(){
        SelectHomeButton_id.click();
    }

}
