import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginToLearningMaterials {

    WebDriver driver;
    @BeforeTest
    public void launchBrowser(){
        driver = new ChromeDriver();
    }

    @Test
    public void startBrowser() throws InterruptedException {
        //driver = new ChromeDriver();
        driver.get("https://www.ndosiautomation.co.za/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void clickLearningMaterials() throws InterruptedException {
        driver.findElement(By.id("nav-btn-practice")).click();
        Thread.sleep(3000);
    }


    @Test(priority = 1)
    public void verifyHomePageIsDisplayed(){
        driver.findElement(By.xpath("//*[@id=\"overview-hero\"]/h2")).isDisplayed();
    }

    @Test(priority = 3)
    public void enterEmail(){
        driver.findElement(By.id("login-email")).sendKeys("Test@testing.com");
    }

    @Test(priority = 4)
    public void enterPassword(){
        driver.findElement(By.id("login-password")).sendKeys("12345678");
    }

    @Test(priority = 5)
    public void clickLoginButton() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void verifyWelcomePageIsDisplayed(){
        driver.findElement(By.id("practice-heading")).isDisplayed();
    }

    @Test(priority = 7)
    public void clickBasicFormButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void verifyPracticeFormIsDisplayed(){
        driver.findElement(By.id("page-title")).isDisplayed();
    }

    @Test(priority = 9)
    public void enterFullName() throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys("Test Testing");
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    public void enterEmailAddress() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("Test@Testing.co.za");
        Thread.sleep(2000);
    }

    @Test(priority = 11)
    public void enterAge() throws InterruptedException {
        driver.findElement(By.id("age")).sendKeys("27");
        Thread.sleep(2000);
    }

    @Test(priority = 12)
    public void selectGender() throws InterruptedException {
        Select gender = new Select(driver.findElement(By.id("gender")));
        gender.selectByValue("male");
        Thread.sleep(2000);
    }

    @Test(priority = 13)
    public void selectCountry() throws InterruptedException {
        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByValue("south-africa");
        Thread.sleep(2000);
    }

    @Test(priority = 14)
    public void selectExperience() throws InterruptedException {
        Select experience = new Select(driver.findElement(By.id("experience")));
        experience.selectByValue("intermediate");
        Thread.sleep(2000);
    }

    @Test(priority = 15)
    public void clickSkillRadioButton() throws InterruptedException {
        driver.findElement(By.id("skill-javascript")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 16)
    public void enterComment() throws InterruptedException {
        driver.findElement(By.id("comments")).sendKeys("Home Done");
        Thread.sleep(2000);
    }

    @Test(priority = 17)
    public void clickTermsRadioButton() throws InterruptedException {
        driver.findElement(By.id("terms")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 18)
    public void clickFormButton() throws InterruptedException {
        driver.findElement(By.id("submit-btn")).click();
        Thread.sleep(3000);
    }

    @AfterTest
    public  void closeBrowser(){
        driver.quit();
    }
}
