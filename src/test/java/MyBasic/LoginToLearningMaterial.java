package MyBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

        driver.findElement(By.id("login-email")).sendKeys("tumi@gmail.com");
    }

    @Test(priority = 4)
    public void enterPassword() {

        driver.findElement(By.id("login-password")).sendKeys("tumi74123");
    }

    @Test(priority = 5)
    public void clickLoginButton() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void VerifyWelcome(){
        driver.findElement(By.xpath("//*[@id=\"practice-heading\"]")).isDisplayed();
    }

    @Test(priority = 7)
    public void clickWebForms() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void EnterName() throws InterruptedException{
        driver.findElement(By.id("name")).sendKeys("Boitumelo");
        Thread.sleep(1000);
    }

    @Test(priority = 9)
    public void EnterEmailAddress() throws InterruptedException{
        driver.findElement(By.id("email")).sendKeys("tumi@gmail.com");
        Thread.sleep(1000);
    }

    @Test(priority =10)
    public void Age() throws InterruptedException{
        driver.findElement(By.id("age")).sendKeys("25");
        Thread.sleep(1000);
    }
    @Test(priority = 11)
    public void DropdownSelectGender() throws InterruptedException{
        driver.findElement(By.id("gender")).click();
        driver.findElement(By.xpath("//*[@id=\"gender\"]/option[3]")).click();
        Thread.sleep(1000);
    }
    @Test(priority = 12)
    public void DropdownSelectCountry() throws InterruptedException{
        driver.findElement(By.id("country")).click();
        driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
        Thread.sleep(1000);
    }

    @Test(priority = 13)
    public void DropdownSelectExperience() throws InterruptedException{
        driver.findElement(By.id("experience")).click();
        driver.findElement(By.xpath("//*[@id=\"experience\"]/option[3]")).click();
        Thread.sleep(1000);
    }

    @Test(priority = 14)
    public void SelectSkill() throws InterruptedException{
        driver.findElement(By.id("skill-javascript")).click();
        Thread.sleep(1000);
    }

    @Test(priority = 15)
    public void EnterComment() throws InterruptedException{
        driver.findElement(By.id("comments")).sendKeys("Testing");
        Thread.sleep(1000);
    }
    @Test(priority = 16)
    public void AcceptTermsAndConditions() throws InterruptedException{
        driver.findElement(By.id("terms")).click();
        Thread.sleep(1000);
    }
    @Test(priority = 17)
    public void SubmitForm() throws InterruptedException{
        driver.findElement(By.id("submit-btn")).click();
        Thread.sleep(1000);
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
