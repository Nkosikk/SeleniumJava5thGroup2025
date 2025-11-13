package Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;


@Test
public class KeishiaTests extends Base {

@Test
    public void ValidLogin() {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();

        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();

        homePage.clickLogoutButton();
    }

@Test (priority = 1)
    public void InValidLogin() {

        //homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();

        loginPage.enterLoginEmail("kb@gmail1.com");
        loginPage.enterPasswordId("D3vt3sting$1");
        loginPage.clickLogin();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertText = alert.getText();
            System.out.println("Alert text: " + alertText);

            Assert.assertEquals("Invalid email or password", "Invalid email or password", alertText);


            alert.accept();
        } catch (TimeoutException e) {
            Assert.fail("Expected alert did not appear!");
        }
    }
@Test(priority = 2)
    public void ExtraSpaces() {
        //homePage.verifyHomePageIsDisplayed();

        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com ");
        loginPage.enterPasswordId(" D3vt3sting# ");
        loginPage.clickLogin();
        homePage.clickLogoutButton();

    }
    @Test(priority = 3)
    public void SelectLogout(){
        //homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.clickLogoutButton();

    }
    @Test (priority = 4)
   public void RegistrationPasswordMismatch() {
        //homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        registrationPage.SelectSignUp();
        registrationPage.RegisterFirstName("Keishia");
        registrationPage.RegisterLastName("Blouws");
        registrationPage.RegisterEmail("12345@gmail.com");
        registrationPage.RegisterPassword("D3vt3sting#123");
        registrationPage.RegisterConfirmPassword("D3vt3sting#");
        registrationPage.SelectCreateAccount();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertText = alert.getText();
            System.out.println("Alert text: " + alertText);

            Assert.assertEquals("Passwords do not match!", "Passwords do not match!", alertText);


            alert.accept();
        } catch (TimeoutException e) {
            Assert.fail("Expected alert did not appear!");
        }

    }
    @Test (priority = 5)
    public void BadEmailFormat() {
        homePage.ClickHomeButton();
        homePage.clickLearningMaterial();
        registrationPage.SelectSignUp();
        registrationPage.RegisterFirstName("Keishia");
        registrationPage.RegisterLastName("Blouws");
        registrationPage.RegisterEmail("1.com");
        registrationPage.RegisterPassword("D3vt3sting#");
        registrationPage.RegisterConfirmPassword("D3vt3sting#");
        registrationPage.SelectCreateAccount();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertText = alert.getText();
            System.out.println("Alert text: " + alertText);

            Assert.assertEquals("Please enter a valid email address", "Please enter a valid email address", alertText);


            alert.accept();
        } catch (TimeoutException e) {
            Assert.fail("Expected alert did not appear!");
        }


    }
    @Test (priority = 6)
    public void VerifyPasswordLength() {
        //homePage.verifyHomePageIsDisplayed();
        homePage.ClickHomeButton();
        homePage.clickLearningMaterial();
        registrationPage.SelectSignUp();
        registrationPage.RegisterFirstName("Keishia");
        registrationPage.RegisterLastName("Blouws");
        registrationPage.RegisterEmail("1234@gmail.com");
        registrationPage.RegisterPassword("12#");
        registrationPage.RegisterConfirmPassword("12#");
        registrationPage.SelectCreateAccount();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertText = alert.getText();
            System.out.println("Alert text: " + alertText);

            Assert.assertEquals("Password must be at least 8 characters long", "Password must be at least 8 characters long", alertText);


            alert.accept();
        } catch (TimeoutException e) {
            Assert.fail("Expected alert did not appear!");
        }

    }
    @Test (priority = 7)
    public void SuccessfullyRegistration() {
        homePage.ClickHomeButton();
        //homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        registrationPage.SelectSignUp();
        registrationPage.RegisterFirstName("Keishia");
        registrationPage.RegisterLastName("Blouws");
        registrationPage.RegisterEmail("12345@gmail.com");
        registrationPage.RegisterPassword("D3vt3sting#");
        registrationPage.RegisterConfirmPassword("D3vt3sting#");
        registrationPage.SelectCreateAccount();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertText = alert.getText();
            System.out.println("Alert text: " + alertText);

            Assert.assertEquals("Registration successful! You can now login with your credentials.", "Registration successful! You can now login with your credentials.", alertText);


            alert.accept();
        } catch (TimeoutException e) {
            Assert.fail("Expected alert did not appear!");
        }

    }

    @Test (priority = 8)
    public void ErrorSummaryRegionAppears() {
        homePage.ClickHomeButton();
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.SelectWebAutomationButton();
        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Tablet");
        webAutomationAdvancePage.selectTabletBrand("Apple");
        webAutomationAdvancePage.SelectDeviceStorage();
        webAutomationAdvancePage.SelectDeviceColour("White");
        webAutomationAdvancePage.SelectDeviceQuantity();
        webAutomationAdvancePage.EnterAddress("test");
        webAutomationAdvancePage.SelectNextButton();
        //homePage.clickLogoutButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement quantityError = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//*[@id=\"inventory-form-grid\"]/div[6]/div/span")));
        Assert.assertTrue(quantityError.getText().contains("QUANTITY MUST BE ≥ 1"),
                "❌ Quantity validation message is missing or incorrect!");

        WebElement summaryError = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//*[@id=\"inventory-errors\"]/span")));
        Assert.assertTrue(summaryError.isDisplayed(),
                "❌ General 'Please correct highlighted fields' message not displayed!");

        System.out.println("✅ Both validation error messages displayed correctly!");
    }

    @Test (priority = 9)
    //All Fields completed
    public void SuccessfulWizard1() throws InterruptedException {
        homePage.ClickHomeButton();
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.SelectWebAutomationButton();
        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Tablet");
        webAutomationAdvancePage.selectTabletBrand("Apple");
        webAutomationAdvancePage.SelectDeviceStorage();
        webAutomationAdvancePage.SelectDeviceColour("White");
        webAutomationAdvancePage.SelectDeviceQuantity();
        webAutomationAdvancePage.EnterAddress("test");
        webAutomationAdvancePage.SelectNextButton();
        Thread.sleep(2000);
       // homePage.clickLogoutButton();
}

    public void PricingPanelNoDevice(){
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.SelectWebAutomationButton();
        webAutomationAdvancePage.EnterAddress("test");
        webAutomationAdvancePage.SelectNextButton();





}

    public void PricingPanelPhone64GBTQty1(){


    }
    public void PricingPanelPhone128GBQty2(){


    }

    public void PricingPanelLaptop256GBQty1(){


    }
    public void ClearDevicePricingResets(){


    }



    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}










