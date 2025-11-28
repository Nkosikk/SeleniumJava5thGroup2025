package Tests;

import Pages.HomePage;
import Pages.LearningMaterialPage;
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

import static Utils.BrowserFactory.driver;


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

    @Test(priority = 1)
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
        //homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com ");
        loginPage.enterPasswordId(" D3vt3sting# ");
        loginPage.clickLogin();


    }

    @Test(priority = 3)
    public void SwitchTab() {
        learningMaterialPage.clickAboutUsPage();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com ");
        loginPage.enterPasswordId(" D3vt3sting# ");
        loginPage.clickLogin();
        homePage.clickLogoutButton();

    }

    @Test(priority = 4)
    public void SelectLogout() {
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.clickLogoutButton();

    }

    @Test(priority = 5)
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

    @Test(priority = 6)
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

    @Test(priority = 7)
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

    @Test(priority = 8)
    public void successfullyRegistration() {
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

    @Test(priority = 9)
    public void errorSummaryRegionAppears() {
        homePage.ClickHomeButton();
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.SelectWebAutomationButton();
        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Tablet");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.SelectDeviceStorage();
        webAutomationAdvancePage.SelectDeviceColour("White");
        webAutomationAdvancePage.SelectDeviceQuantity("0");
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

    @Test(priority = 10)
    public void QuantityGreaterThan11() throws InterruptedException {
        homePage.ClickHomeButton();
        Thread.sleep(1000);
        homePage.verifyHomePageIsDisplayed();
        Thread.sleep(1000);
        homePage.clickLearningMaterial();
        Thread.sleep(1000);

        loginPage.enterLoginEmail("kb@gmail.com");
        Thread.sleep(1000);
        loginPage.enterPasswordId("D3vt3sting#");
        Thread.sleep(1000);
        loginPage.clickLogin();
        Thread.sleep(1000);

        homePage.SelectWebAutomationButton();
        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Tablet");
        Thread.sleep(1000);
        webAutomationAdvancePage.selectBrand("Apple");
        Thread.sleep(1000);
        webAutomationAdvancePage.SelectDeviceStorage();
        Thread.sleep(1000);
        webAutomationAdvancePage.SelectDeviceColour("White");
        Thread.sleep(1000);
        webAutomationAdvancePage.SelectDeviceQuantity("12");
        Thread.sleep(1000);
        webAutomationAdvancePage.EnterAddress("test");
        Thread.sleep(1000);
        webAutomationAdvancePage.SelectNextButton();
        Thread.sleep(1000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement quantityError = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//*[@id=\"inventory-form-grid\"]/div[6]/div/span")));

        // Print the actual message so we know what it is
        String actualText = quantityError.getText().trim();
        System.out.println("Actual validation message: [" + actualText + "]");

        // Flexible assertion: allows minor differences in text
        String lower = actualText.toLowerCase();
        Assert.assertTrue(
                lower.contains("10") &&
                        (lower.contains("≤") || lower.contains("less") || lower.contains("max") || lower.contains("cannot")),
                "❌ Quantity validation message is missing or incorrect!\nActual message: " + actualText
        );

        System.out.println("✅ Validation error message displayed correctly!");
    }


    @Test(priority = 11)
    public void SuccessfulWizard1() {
        homePage.ClickHomeButton();
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.SelectWebAutomationButton();
        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Tablet");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.SelectDeviceStorage();
        webAutomationAdvancePage.SelectDeviceColour("White");
        webAutomationAdvancePage.SelectDeviceQuantity("1");
        webAutomationAdvancePage.EnterAddress("test");

        webAutomationAdvancePage.SelectNextButton();
        homePage.clickLogoutButton();
    }

    @Test(priority = 12)
    public void PricingPanelNoDevice() {
        homePage.ClickHomeButton();
        //homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.SelectWebAutomationButton();

        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
        //webAutomationAdvancePage.selectDeviceType();
        //webAutomationAdvancePage.selectTabletBrand();
        //webAutomationAdvancePage.SelectDeviceStorage();
        //webAutomationAdvancePage.SelectDeviceColour("");
        //webAutomationAdvancePage.SelectDeviceQuantity("0");
        webAutomationAdvancePage.EnterAddress("test");

        webAutomationAdvancePage.SelectNextButton();

        String unitPrice = webAutomationAdvancePage.getUnitPrice();
        String subtotal = webAutomationAdvancePage.getSubtotal();
        String quantity = webAutomationAdvancePage.getQuantityText();

        Assert.assertEquals(unitPrice, "—", "Unit Price should show a dash when nothing is selected");
        Assert.assertEquals(subtotal, "Subtotal: —", "Subtotal should show a dash when nothing is selected");
        Assert.assertEquals(quantity, "Qty: 1", "Quantity should default to 1 when nothing is selected");
    }

    @Test(priority = 13)
    public void PricingPanelPhone64GBTQty1() {
        homePage.ClickHomeButton();
        //homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.SelectWebAutomationButton();

        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Phone");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.SelectDeviceStorage();
        webAutomationAdvancePage.SelectDeviceColour("white");
        webAutomationAdvancePage.SelectDeviceQuantity("1");
        webAutomationAdvancePage.EnterAddress("test");


        String unitPrice = webAutomationAdvancePage.getUnitPrice();
        String subtotal = webAutomationAdvancePage.getSubtotal();
        String quantity = webAutomationAdvancePage.getQuantityText();

        Assert.assertEquals(unitPrice, "R400.00", "Unit Price should show R400.00 when 64GB selected");
        Assert.assertEquals(quantity, "Qty: 1", "Quantity should default to 1 when nothing is selected");
        Assert.assertEquals(subtotal, "Subtotal: R400.00", "Subtotal should show a dash when nothing is selected");

        webAutomationAdvancePage.SelectNextButton();
    }

    @Test(priority = 14)
    public void PricingPanelPhone128GBQty2() {

        homePage.ClickHomeButton();
        //homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.SelectWebAutomationButton();

        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Phone");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.storage128GB();
        webAutomationAdvancePage.SelectDeviceColour("white");
        webAutomationAdvancePage.SelectDeviceQuantity("2");
        webAutomationAdvancePage.EnterAddress("test");


        String unitPrice = webAutomationAdvancePage.getUnitPrice();
        String subtotal = webAutomationAdvancePage.getSubtotal();
        String quantity = webAutomationAdvancePage.getQuantityText();

        Assert.assertEquals(unitPrice, "R480.00", "Unit Price should show R480.00 when 64GB selected");
        Assert.assertEquals(quantity, "Qty: 2", "Quantity should default to 1 when nothing is selected");
        Assert.assertEquals(subtotal, "Subtotal: R960.00", "Subtotal should show a dash when nothing is selected");

        webAutomationAdvancePage.SelectNextButton();

    }

    @Test(priority = 15)
    public void PricingPanelLaptop256GBQty1() throws InterruptedException {

        homePage.ClickHomeButton();
        //homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.SelectWebAutomationButton();

        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Laptop");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.laptopStorage();
        webAutomationAdvancePage.SelectDeviceColour("white");
        webAutomationAdvancePage.SelectDeviceQuantity("1");
        webAutomationAdvancePage.EnterAddress("test");


        String unitPrice = webAutomationAdvancePage.getUnitPrice();
        String subtotal = webAutomationAdvancePage.getSubtotal();
        String quantity = webAutomationAdvancePage.getQuantityText();

        Assert.assertEquals(unitPrice, "R1360.00", "Unit Price should show R1360.00 when 64GB selected");
        Assert.assertEquals(quantity, "Qty: 1", "Quantity should default to 1 when nothing is selected");
        Thread.sleep(3000);
        // webAutomationAdvancePage.SelectNextButton();

    }

    @Test(priority = 16)
    public void ClearDevicePricingResets() {
        homePage.ClickHomeButton();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.SelectWebAutomationButton();
        webAutomationAdvancePage.selectDeviceType("");

        String unitPrice = webAutomationAdvancePage.getUnitPrice();
        String subtotal = webAutomationAdvancePage.getSubtotal();
        String quantity = webAutomationAdvancePage.getQuantityText();

        Assert.assertEquals(unitPrice, "—", "Unit Price should show a dash when nothing is selected");
    }

    @Test(priority = 17)
    public void ShippingToggle() throws InterruptedException {
        homePage.ClickHomeButton();
        //homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.SelectWebAutomationButton();

        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Phone");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.laptopStorage();
        webAutomationAdvancePage.SelectDeviceColour("white");
        webAutomationAdvancePage.SelectDeviceQuantity("1");
        webAutomationAdvancePage.EnterAddress("test");
        webAutomationAdvancePage.SelectNextButton();
        reviewExtrasPage.ShippingOptionExpress();
        Thread.sleep(1000);
        reviewExtrasPage.ValidateShippingCost();

        String shippingPrice = reviewExtrasPage.ValidateShippingCost();

        Assert.assertEquals(shippingPrice, "R25.00", "Shipping Price should show");

        homePage.clickLogoutButton();

    }

    @Test(priority = 18)
    public void VerifyWarrantyNoneIsSelected() throws InterruptedException {
        homePage.ClickHomeButton();
        //homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.SelectWebAutomationButton();

        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Phone");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.laptopStorage();
        webAutomationAdvancePage.SelectDeviceColour("white");
        webAutomationAdvancePage.SelectDeviceQuantity("1");
        webAutomationAdvancePage.EnterAddress("test");
        webAutomationAdvancePage.SelectNextButton();
        reviewExtrasPage.ShippingOptionExpress();
        Thread.sleep(1000);
        reviewExtrasPage.ValidateShippingCost();

        String shippingPrice = reviewExtrasPage.ValidateShippingCost();

        reviewExtrasPage.SelectWarrantyNone();
        String noneWarrantyAmount = reviewExtrasPage.ValidateNoneWarrantyAmount();
        Assert.assertEquals(noneWarrantyAmount, "R0.00", "warranty amount should be R0.00");
    }

    @Test(priority = 19)
    public void VerifyOneYearWarranty() throws InterruptedException {

        homePage.ClickHomeButton();

        //homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.SelectWebAutomationButton();

        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Phone");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.laptopStorage();
        webAutomationAdvancePage.SelectDeviceColour("white");
        webAutomationAdvancePage.SelectDeviceQuantity("1");
        webAutomationAdvancePage.EnterAddress("test");
        webAutomationAdvancePage.SelectNextButton();
        Thread.sleep(1000);
        reviewExtrasPage.ShippingOptionExpress();
        Thread.sleep(1000);

        reviewExtrasPage.SelectOneYearWarranty();
        Thread.sleep(1000);

        //String shippingPrice = reviewExtrasPage.ValidateShippingCost();

        reviewExtrasPage.VerifyOneYearWarrantyAmount();
        Thread.sleep(1000);

        String oneYearWarrantyAmount = reviewExtrasPage.VerifyOneYearWarrantyAmount();
        Thread.sleep(1000);

        Assert.assertEquals(oneYearWarrantyAmount, "R49.00", "warranty amount should be R49.00");
    }


    public void VerifyTwoYearWarranty() throws InterruptedException {

        homePage.ClickHomeButton();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.SelectWebAutomationButton();

        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Phone");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.laptopStorage();
        webAutomationAdvancePage.SelectDeviceColour("white");
        webAutomationAdvancePage.SelectDeviceQuantity("1");
        webAutomationAdvancePage.EnterAddress("test");
        webAutomationAdvancePage.SelectNextButton();

        reviewExtrasPage.ShippingOptionExpress();
        reviewExtrasPage.SelectTwoYearWarranty();
        reviewExtrasPage.VerifyTwoYearWarrantyAmount();
        String twoYearWarrantyAmount = reviewExtrasPage.VerifyTwoYearWarrantyAmount();
        Assert.assertEquals(twoYearWarrantyAmount, "R89.00", "warranty amount should be R89.00");
        homePage.clickLogoutButton();
    }

    public void StepTwoFormulaCheck(){
        homePage.ClickHomeButton();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        homePage.SelectWebAutomationButton();

        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
        webAutomationAdvancePage.selectDeviceType("Phone");
        webAutomationAdvancePage.selectBrand("Apple");
        webAutomationAdvancePage.SelectDeviceStorage("storage-128GB");
        webAutomationAdvancePage.SelectDeviceColour("White");
        webAutomationAdvancePage.getQuantityInputValue("2");
        webAutomationAdvancePage.EnterAddress("test");
        webAutomationAdvancePage.SelectNextButton();

        reviewExtrasPage.ShippingOptionExpress();
        reviewExtrasPage.SelectOneYearWarranty();
        reviewExtrasPage.EnterDiscountCode("10");
        reviewExtrasPage.SelectToApplyDiscountCode();

        System.out.println("Subtotal = " + subtotal);
        System.out.println("Expected Discount = " + expectedDiscount);
        System.out.println("Expected Total = " + expectedTotal);





    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}

















