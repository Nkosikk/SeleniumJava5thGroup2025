package Tests;

import Utils.ReadFromFile;
import Utils.TakeScreenShot;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

@Test
public class NdosiTest extends Base {

    public void verifyHomePageIsDisplayedTest() throws InterruptedException{
        homePage.verifyHomePageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyHomePageIsDisplayedTest")
    public void clickLearningMaterialTests() {
        homePage.clickLearningMaterial();
        TakeScreenShot takeScreenshots = new TakeScreenShot();
        takeScreenshots.takesSnapShot(driver, "LearningMaterialPage");
    }

    @Test(dependsOnMethods = "clickLearningMaterialTests")
    public void enterLoginEmail() {
        loginPage.enterEmail();
    }

    @Test(dependsOnMethods = "enterLoginEmail")
    public void enterPassword() {
        loginPage.enterPassword();
    }

    @Test(dependsOnMethods = "enterPassword")
    public void clickLoginTests() throws InterruptedException{
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyWelcomeHeading() {
        learningMaterialPage.verifyHomePageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyWelcomeHeading")
    public void clickWebAutomationAdvancePage() throws InterruptedException {
        webAutomationAdvancePage.clickWebAutomationAdvancePage();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickWebAutomationAdvancePage")
    public void verifyWebAutomationAdvancePageIsDisplayedTest(){
        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyWebAutomationAdvancePageIsDisplayedTest")
    public void selectDeviceTypeTest() throws InterruptedException {
        webAutomationAdvancePage.clickDeviceType("Phone");
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "selectDeviceTypeTest")
    public void selectDeviceBrandTest() throws InterruptedException {
        webAutomationAdvancePage.clickBrand("Apple");
        Thread.sleep(4000);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
