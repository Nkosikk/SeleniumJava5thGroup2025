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
        loginPage.enterLoginEmail("nkosi@gmail.com");
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


    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
