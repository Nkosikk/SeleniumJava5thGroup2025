package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;


public class LoginToLearningMaterial {

    WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        driver = new ChromeDriver();

    }

    @Test
    public void startBrowser() throws InterruptedException {
        // driver = new ChromeDriver();
        driver.get("https://www.ndosiautomation.co.za/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void verifyHomePageIsDisplayed() {
        driver.findElement(By.xpath("//*[@id=\"overview-hero\"]/h2")).isDisplayed();
    }

    @Test(priority = 2)
    public void clickLearningMaterials() throws InterruptedException {
        driver.findElement(By.id("nav-btn-practice")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void enterEmail() {
        driver.findElement(By.id("login-email")).sendKeys("kgmokhatla@gmail.com");
    }

    @Test(priority = 4)
    public void enterPassword() {
        driver.findElement(By.id("login-password")).sendKeys("asdfghjklzxcvbnm");
    }

    @Test(priority = 5)
    public void clickLoginButton() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void clickWebAutomationBasicForm() throws InterruptedException{
        driver.findElement(By.id("tab-btn-password")).isDisplayed();
        Thread.sleep(1000);
    }

    @Test(priority = 7)
    public void clickWebForms() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
        Thread.sleep(1000);
    }

    @Test(priority = 8)
    public void enterFullName()  {
        driver.findElement(By.id("name")).sendKeys("Katleho");
    }

    @Test(priority = 9)
    public void EnterEmail() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("kgmokhatla@gmail.com");
        Thread.sleep(1000);
    }

    @Test(priority = 10)
    public void enterAge() throws InterruptedException {
        driver.findElement(By.id("age")).sendKeys("29");
        Thread.sleep(1000);
    }

    @Test(priority = 11)
    public void selectGender()  {
        WebElement dropdown = driver.findElement(By.id("gender"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Male");
    }

    @Test(priority = 12)
    public void selectCountry()  {
        WebElement dropdown = driver.findElement(By.id("country"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("South Africa");
    }

    @Test(priority = 13)
    public void selectExperience()  {
        WebElement dropdown = driver.findElement(By.id("experience"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Beginner (0-1 years)");
    }


    @Test(priority = 14)
    public void selectSkill() throws InterruptedException {
        WebElement checkbox = driver.findElement(By.id("skill-javascript"));
        if (!checkbox.isSelected()){
            checkbox.click();
        }
        Thread.sleep(1000);
    }

    @Test(priority = 15)
    public void enterComment() throws InterruptedException {
        driver.findElement(By.id("comments")).sendKeys("Automation Is Interesting");
        Thread.sleep(1000);
    }

    @Test(priority = 16)
    public void selectTerms(){
        WebElement checkbox = driver.findElement(By.id("terms"));
        if (!checkbox.isSelected()){
            checkbox.click();
        }
    }

    @Test(priority = 17)
    public void clickSubmit() throws InterruptedException {
        driver.findElement(By.id("submit-btn")).click();
        Thread.sleep(1000);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
