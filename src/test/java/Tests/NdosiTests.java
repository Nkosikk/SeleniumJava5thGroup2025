package Tests;

import Utils.TakeScreenshots;
import io.reactivex.rxjava3.internal.functions.Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.awt.SystemColor.window;

@Test
public class NdosiTests extends Base{


    public void verifyHomePageIsDisplayedTests(){
        homePage.verifyHomePageIsDisplayed();
    }
    @Test(dependsOnMethods = "verifyHomePageIsDisplayedTests")
    public void clickLearningMaterialTests() {
        homePage.clickLearningMaterial();
        takeScreenshots.takesSnapShot(driver, "LearningMaterialPage");
    }

    @Test(dependsOnMethods = "clickLearningMaterialTests")
    public void enterLoginEmail(){
        loginPage.enterLoginEmail("soundytest@gmail.com");
    }

    @Test(dependsOnMethods = "enterLoginEmail")
    public void enterPasswordTests() {
        loginPage.enterPasswordId("12345678");
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() {
        loginPage.clickLogin();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyWelcomeHeading() {
        learningMaterialPage.verifyHeading();
    }

    @Test(dependsOnMethods = "verifyWelcomeHeading")
    public void clickWebAutomationAdvanceTab() throws InterruptedException {
        learningMaterialPage.clickWebAutomationAdvanceTab();
      Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickWebAutomationAdvanceTab")
    public void verifyWebAutomationAdvancePageIsDisplayedTest(){
        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyWebAutomationAdvancePageIsDisplayedTest")
    public void selectDeviceTypeTest() throws InterruptedException {
      webAutomationAdvancePage.selectDeviceType("Tablet");
      Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "selectDeviceTypeTest")
    public void selectDeviceBrandTest() throws InterruptedException {
        webAutomationAdvancePage.selectTabletBrand("Samsung");
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "selectDeviceBrandTest")
    public void clickStorage() throws InterruptedException {
        webAutomationAdvancePage.selectStorage("64GB");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickStorage")
    public void selectColor() throws InterruptedException {
        webAutomationAdvancePage.selectColor("gold");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "selectColor")
    public void enterQuantity() throws InterruptedException {
        webAutomationAdvancePage.enterQuantity("2");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "enterQuantity")
    public void enterDeliveryAddress() throws InterruptedException {
        webAutomationAdvancePage.deliveryAddress("123 Soundy Street, Cape Town, 8000");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "enterDeliveryAddress")
    public void clickNextButton() throws InterruptedException {
        webAutomationAdvancePage.clickNextButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickNextButton")
    public void selectShippingOption() throws InterruptedException {
        webAutomationAdvancePage.selectShippingOption();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "selectShippingOption")
    public void selectWarrantyOption() throws InterruptedException {
        webAutomationAdvancePage.selectWarrantyOption();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "selectWarrantyOption")
    public void enterDiscountCode() throws InterruptedException {
        webAutomationAdvancePage.enterDiscountCode("SAVE10");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "enterDiscountCode")
    public void clickApplyDiscountButton() throws InterruptedException {
        webAutomationAdvancePage.clickApplyDiscountButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickApplyDiscountButton")
    public void clickAddToCartButton() throws InterruptedException {
        webAutomationAdvancePage.clickAddToCartButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickAddToCartButton")
    public void clickReviewCartButton() throws InterruptedException {
        webAutomationAdvancePage.clickReviewCartButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickReviewCartButton")
    public void clickConfirmCartButton() throws InterruptedException {
        webAutomationAdvancePage.clickConfirmCartButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickConfirmCartButton")
    public void verifyOrderConfirmation(){
        webAutomationAdvancePage.verifyPurchaseSuccessToastIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyOrderConfirmation")
    public void clickInvoiceButton() throws InterruptedException {
        webAutomationAdvancePage.clickViewInvoiceButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickInvoiceButton")
    public void verifyInvoiceHistoryPanelIsDisplayedTest(){
        webAutomationAdvancePage.verifyInvoiceHistoryPanelIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyInvoiceHistoryPanelIsDisplayedTest")
    public void clickDownloadInvoiceButton() throws InterruptedException {
        webAutomationAdvancePage.clickDownloadInvoiceButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickDownloadInvoiceButton")
    public void clickGetViewInvoiceButton() throws InterruptedException {
        webAutomationAdvancePage.clickGetViewInvoiceButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickGetViewInvoiceButton")
    public void switchPage() throws InterruptedException {
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(windowHandles);
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "switchPage")
    public void clickCloseInvoiceHistoryButton() throws InterruptedException {
        webAutomationAdvancePage.clickCloseInvoiceHistoryButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickCloseInvoiceHistoryButton")
    public void verifyPracticeHeadingIsDisplayedTest() throws InterruptedException {
        webAutomationAdvancePage.verifyPracticeHeadingIsDisplayed();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0);");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "verifyPracticeHeadingIsDisplayedTest")
    public void clickLogoutButtonTest() throws InterruptedException {
        webAutomationAdvancePage.clickLogOutButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickLogoutButtonTest")
    public void verifyLoginHeadingIsDisplayedTest() throws InterruptedException {
        webAutomationAdvancePage.verifyLoginHeadingIsDisplayed();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "verifyLoginHeadingIsDisplayedTest")
    public void clickSignUpToggleTest() throws InterruptedException {
        registrationPage.clickSignUp();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickSignUpToggleTest")
    public void enterFirstNameTest(){
        registrationPage.enterFirstName("Nkosazana");
    }

    @Test(dependsOnMethods = "enterFirstNameTest")
    public void enterLastNameTest(){
        registrationPage.enterLastName("Nkosi");
    }

    @Test(dependsOnMethods = "enterLastNameTest")
    public void enterRegisterEmailTest(){
        registrationPage.enterRegisterEmail("nkosi@test.co.za");
    }

    @Test(dependsOnMethods = "enterRegisterEmailTest")
    public void enterRegisterPasswordTest(){
        registrationPage.enterRegisterPassword("12345678");
    }

    @Test(dependsOnMethods = "enterRegisterPasswordTest")
    public void enterConfirmPasswordTest(){
        registrationPage.enterConfirmPassword("12345678");
    }

    @Test(dependsOnMethods = "enterConfirmPasswordTest")
    public void clickRegisterSubmitTest(){
        registrationPage.clickRegisterSubmit();
    }




    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}


// public void verifySuccessfulLogin(){
//    homePage.clickLearningMaterial();
//  loginPage.enterLoginEmail("soundytest@gmail.com");
//loginPage.enterPasswordId("12345678");
//loginPage.clickLogin();
//learningMaterialPage.verifyHeading();
//}