package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class NdosiTests extends Base{


    public void verifyHomePageIsDisplayedTests(){
        homePage.verifyHomePageIsDisplayed();
    }
    @Test(dependsOnMethods = "verifyHomePageIsDisplayedTests")
    public void clickLearningMaterialTests() {
        homePage.clickLearningMaterial();
    }

    @Test(dependsOnMethods = "clickLearningMaterialTests")
    public void enterLoginEmail(){
        loginPage.enterLoginEmail("ap.mshumpela@yahoo.com");
    }

    @Test(dependsOnMethods = "enterLoginEmail")
    public void enterPasswordTests() {
        loginPage.enterPasswordId("Bolo1234");
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

    @Test(dependsOnMethods = "clickWebAutomationAdvancetab")
    public void verifyWebAutomationAdvancedPageIsDisplayed() {
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
    public void selectStorageOptionTest(){
        webAutomationAdvancePage.selectStorageOption();

    }
    @Test(dependsOnMethods = "selectStorageOptionTest")
    public void selectColorOptionTest(){
        webAutomationAdvancePage.selectColorOption();
    }

    @Test(dependsOnMethods = "SelectColorOtionTest")
    public void enterQuantityTest(){
        webAutomationAdvancePage.enterQuantity("2");
    }

    @Test(dependsOnMethods = "enterQuantityTest")
    public void enterAddressTest(){
        webAutomationAdvancePage.enterAddress("no 27 main miami");
    }

    @Test(dependsOnMethods = "enterAdressTest")
   public void clickNextButtonTest(){
        webAutomationAdvancePage.clickNextButton();
    }
     @Test(dependsOnMethods = "clickNextButtonTest")
     public void verifyOrderSuccessToastIsDisplayedTest(){
        webAutomationAdvancePage.verifyOrderSuccessToastIsDisplayed();
     }






    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
