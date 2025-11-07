package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class KeishiaTests extends Base{


    public void ValidLogin(){
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
    }

    public void InValidLogin(){
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail1.com");
        loginPage.enterPasswordId("D3vt3sting$1");
        loginPage.clickLogin();

    }

    public void VerifyExtraSpaces(){
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail(" kb@gmail1.com ");
        loginPage.enterPasswordId(" D3vt3sting$1 ");
        loginPage.clickLogin();


    }

    public void SelectLogout(){
        homePage.verifyHomePageIsDisplayed();
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("kb@gmail.com");
        loginPage.enterPasswordId("D3vt3sting#");
        loginPage.clickLogin();
        loginPage.clickLogoutButton();




    }

    public void RegistrationMismatch(){

    }

    public void BadEmailFormat(){

    }

    public void VerifyPasswordLength(){

    }

    public void SuccessfullyRegistration(){

    }


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
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
