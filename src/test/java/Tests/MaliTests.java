package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class MaliTests extends Base{
    @Test
    public void verifyHomePageIsDisplayed() {
        homePage.verifyHomePageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyHomePageIsDisplayed")
    public void clickLearningMaterial() {
        homePage.clickLearningMaterial();
    }

    @Test(dependsOnMethods = "clickLearningMaterial")
    public void enterLoginEmail() {
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
    public void selectStorage() throws InterruptedException {
        webAutomationAdvancePage.selectStorageOption();
        Thread.sleep(4000);
    }
    @Test(dependsOnMethods = "selectStorage")
    public void selectQuantity() throws InterruptedException {
        webAutomationAdvancePage.selectTabletBrand("Samsung");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "selectQuantity")
    public void enterAdress() throws InterruptedException {
        webAutomationAdvancePage.enterAddress("1234 Mali Street,Cape Town");
        // Thread.sleep(2000);
    }

        @Test(dependsOnMethods = "enterAdress")
                public void clickNextButton() throws InterruptedException{

            webAutomationAdvancePage.clickNextButton();
         Thread.sleep(2000);
        }
           @Test(dependsOnMethods = " clickNextButton")
           public void addToCart(){
              webAutomationAdvancePage.clickAddToCartButton();
           }



    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
