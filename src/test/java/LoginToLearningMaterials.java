import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
    public void startBrowser(){
        driver.get("https://www.ndosiautomation.co.za/");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void verifyHomePageIsDisplayed() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"overview-section\"]")).isDisplayed();
        Thread.sleep (2000);
    }

    @Test(priority = 2)
    public void clickLearningMaterials() throws InterruptedException {
        driver.findElement(By.id("nav-btn-practice")).click();
        Thread.sleep(1000);
    }

   @Test(priority = 3)
   public void enterEmail()  throws InterruptedException {
        driver.findElement(By.id("login-email")).sendKeys("boolbaby@gmail.com");
        Thread.sleep(500);
   }

   @Test(priority = 4)
   public void enterPassword()  throws InterruptedException {
        driver.findElement(By.id("login-password")).sendKeys("TheBaby101!");
        Thread.sleep(500);
   }

   @Test(priority = 5)
   public void clickLoginButton()  throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(2000);
   }

   @Test(priority = 6)
   public void clickWebAutomationBasicForm()  throws InterruptedException {
        driver.findElement(By.id("tab-btn-password")).click();
        Thread.sleep(2000);
   }

    @Test(priority = 7)
    public void enterFullName ()  throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys("Lesedi Mmathapelo Sedibe");
        Thread.sleep(500);
    }

    @Test(priority = 8)
    public void enterEmailAddress ()  throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("lesedi.sedibe@gmail.com");
        Thread.sleep(500);
    }

    @Test(priority = 9)
    public void enterAge ()  throws InterruptedException {
        driver.findElement(By.id("age")).sendKeys("24");
        Thread.sleep(500);
    }

    @Test(priority = 10)
    public void selectGender ()  throws InterruptedException {
        Select genderDropdown = new Select(driver.findElement(By.id("gender")));
        genderDropdown.selectByVisibleText("Female");
        Thread.sleep(500);
    }

    @Test(priority = 11)
    public void selectCountry ()  throws InterruptedException {
        Select countryDropdown = new Select(driver.findElement(By.id("country")));
        countryDropdown.selectByVisibleText("South Africa");
        Thread.sleep(500);
    }

    @Test(priority = 12)
    public void selectExperience ()  throws InterruptedException {
        Select experience = new Select(driver.findElement(By.id("experience")));
        experience.selectByVisibleText("Intermediate (2-5 years)");
        Thread.sleep(500);
    }

    @Test(priority = 13)
    public void selectSkills ()  throws InterruptedException {
        driver.findElement(By.id("skill-java")).click();
        driver.findElement(By.id("skill-selenium")).click();
        Thread.sleep(500);

    }

    @Test(priority = 14)
    public void enterComments ()  throws InterruptedException {
        driver.findElement(By.id("comments")).sendKeys("I am learning Automation Testing!");
        Thread.sleep(1500);
    }

    @Test(priority = 15)
    public void clickTermsButton()  throws InterruptedException {
        driver.findElement(By.id("terms")).click();
        Thread.sleep(500);
    }

    @Test(priority = 16)
    public void clickSubmitButton()  throws InterruptedException {
        driver.findElement(By.id("submit-btn")).click();
        Thread.sleep(2000);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
