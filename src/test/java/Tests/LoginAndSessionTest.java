package Tests;

import org.testng.annotations.Test;

@Test
public class LoginAndSessionTest extends Base {


    @Test
    public void verifySuccessfulLogin() {
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("soundytest@gmail.com");
        loginPage.enterPasswordId("12345678");
        loginPage.clickLogin();
        learningMaterialPage.verifyHeading();
    }

    @Test(dependsOnMethods = "verifySuccessfulLogin")
    public void verifyUnSuccessfulLogin() {
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("soundytest@gmail.com");
        loginPage.enterPasswordId("123456789");
        loginPage.clickLogin();

    }

    @Test(dependsOnMethods = "verifyUnSuccessfulLogin")
    public void verifySuccessfulLoginWithSpaces() {
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail(" soundytest@gmail.com ");
        loginPage.enterPasswordId(" 12345678 ");
        loginPage.clickLogin();
        learningMaterialPage.verifyHeading();
    }

    @Test(dependsOnMethods = "verifySuccessfulLoginWithSpaces")
    public void verifyForcedLogOut() {
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("soundytest@gmail.com");
        loginPage.enterPasswordId("12345678");
        loginPage.clickLogin();
       driver.navigate().back();
       loginPage.clickLogin();
    }

    @Test(dependsOnMethods = "verifyForcedLogOut")
    public void verifyLogOut() {
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("soundytest@gmail.com");
        loginPage.enterPasswordId("12345678");
        loginPage.clickLogin();
        webAutomationAdvancePage.clickLogOutButton();
    }


}
