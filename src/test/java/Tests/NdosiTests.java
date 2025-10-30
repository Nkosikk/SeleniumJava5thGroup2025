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
        loginPage.enterLoginEmail("rcstest@gmail.com");
    }

    @Test(dependsOnMethods = "enterLoginEmail")
    public void enterPasswordTests() {
        loginPage.enterPasswordId("95354601");
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



    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
