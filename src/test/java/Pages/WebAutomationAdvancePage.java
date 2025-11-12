package Pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class WebAutomationAdvancePage {

    WebDriver driver;

    @FindBy(id = "inventory-title")
    WebElement inventoryHeader_id;

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
    public void clickWebAutomationAdvancePage() throws InterruptedException {
        driver.findElement(By.id("tab-btn-web")).click();
        Thread.sleep(2000);
    }

    public void verifyInventoryHeaderIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(inventoryHeader_id));
        inventoryHeader_id.isDisplayed();
    }

    @Test(priority = 7)
    public void clickDeviceType() {
        WebElement dropdown = driver.findElement(By.id("deviceType"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Phone");
    }

    @Test(priority = 8)
    public void clickBrand() {
        WebElement dropdown = driver.findElement(By.id("brand"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Apple");
    }

    @Test(priority = 9)
    public void selectStorage() {
       WebElement checkbox = driver.findElement(By.id("storage-128GB"));
       if (!checkbox.isSelected()) {
           checkbox.click();
       }
    }

    @Test(priority = 10)
    public void chooseColor() {
       WebElement dropdown = driver.findElement(By.name("color"));
       Select select = new Select(dropdown);
       select.selectByVisibleText("Black");
    }

    @Test(priority = 11)
    public void enterQuantity() {
        driver.findElement(By.id("quantity")).sendKeys("0");
    }

    @Test(priority = 12)
    public void enterDeliveryAdress() {
        driver.findElement(By.id("address")).sendKeys("Kroonstad");
    }

    @Test(priority = 13)
    public void clickInventoryNextButton() throws InterruptedException {
        driver.findElement(By.id("inventory-next-btn")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 14)
    public void selectShippingOptionMethod() throws InterruptedException {
        WebElement checkbox = driver.findElement(By.id("shipping-option-standard"));
        if (!checkbox.isSelected()){
            checkbox.click();
        }
        Thread.sleep(2000);
    }

    @Test(priority = 15)
    public void selectWarrantyOption() throws InterruptedException{
        WebElement checkbox = driver.findElement(By.id("warranty-option-none"));
        if (!checkbox.isSelected()){
            checkbox.click();
        }
        Thread.sleep(2000);
    }

    @Test(priority = 16)
    public void enterDiscountCode() throws InterruptedException {
        driver.findElement(By.id("discount-code")).sendKeys("SAVE10");
        Thread.sleep(2000);
    }

    @Test(priority = 17)
    public void clickPurchaseDeviceButton()  {
        driver.findElement(By.id("purchase-device-btn")).click();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}


