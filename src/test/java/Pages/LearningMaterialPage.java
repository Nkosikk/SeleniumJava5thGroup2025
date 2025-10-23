package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LearningMaterialPage {
    WebDriver driver;
    @FindBy(id = "practice-heading")
    WebElement welcomeHeading_id;

    public LearningMaterialPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHeading(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(welcomeHeading_id));
        welcomeHeading_id.isDisplayed();}
}
