package Tests;

import org.testng.annotations.Test;

@Test
public class LoginAndSessionTest extends Base {


    public void verifySuccessfulLogin() {
        homePage.clickLearningMaterial();
        loginPage.enterLoginEmail("soundytest@gmail.com");
        loginPage.enterPasswordId("12345678");
        loginPage.clickLogin();
        learningMaterialPage.verifyHeading();
    }

}
