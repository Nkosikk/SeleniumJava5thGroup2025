package Tests;


import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class KeishiaTests extends Base {


    public void ValidLogin() {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.clickLogoutButton();
    }

    public void InValidLogin() {
        homePage.verifyHomePageIsDisplayed();
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

    public void ExtraSpaces() {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail(" kb@gmail.com  ");
        loginPage.enterPasswordId("  D3vt3sting#  ");
        loginPage.clickLogin();
        homePage.clickLogoutButton();

    }

    public void SelectLogout() throws InterruptedException {
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.clickLogoutButton();

    }

    public void RegistrationPasswordMismatch() {
        homePage.verifyHomePageIsDisplayed();
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

    public void BadEmailFormat() {
        homePage.verifyHomePageIsDisplayed();
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

    public void VerifyPasswordLength() {
        homePage.verifyHomePageIsDisplayed();
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

    public void SuccessfullyRegistration() {
        homePage.verifyHomePageIsDisplayed();
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

    //Fix up!!!
    public void WizardStep1FieldsMissing() {
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
        webAutomationAdvancePage.SelectDeviceQuantity();
        webAutomationAdvancePage.EnterAddress("");
        webAutomationAdvancePage.SelectNextButton();
        homePage.clickLogoutButton();
    }

    public void WizardStep1AllFieldsInserted() {
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
        webAutomationAdvancePage.EnterAddress("12345@gmail.com");
        webAutomationAdvancePage.SelectNextButton();
        homePage.clickLogoutButton();
    }



    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}










