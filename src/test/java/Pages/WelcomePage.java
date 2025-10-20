package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage {

    WebDriver driver;

    @FindBy(id = "practice-heading")
    WebElement WelcomeBackMessage_id;

    @FindBy(id = "page-title")
    WebElement SeleniumPracticeForm_id;

    @FindBy(id = "name")
    WebElement InsertName_id;

    @FindBy(id = "email")
    WebElement InsertEmail_id;

    @FindBy(id = "age")
    WebElement InsertAge_id;

    @FindBy (id = "gender")
    WebElement InsertGender_id;

    @FindBy(id = "Female")
    WebElement InsertFemale_id;


    @FindBy (id = "country")
    WebElement InsertCountry_id;

    @FindBy(id = "United Kingdom")
    WebElement InsertCountryName_id;

    @FindBy (id = "experience")
    WebElement InsertExperienceLevel_id;
    @FindBy(id = "advanced")
    WebElement InsertLevel_id;

    @FindBy (id = "skill-python")
    WebElement SelectSkill_id;

    @FindBy (id = "comments")
    WebElement InsertComment_id;

    @FindBy (id = "terms")
    WebElement SelectTermsAndConditions_id;

    @FindBy (id = "submit-btn")
    WebElement SubmitForm;


    public WelcomePage (WebDriver driver){
        this.driver=driver;
    }

    public void VerifyWelcomeBackMessageIsDisplayed (){
        WelcomeBackMessage_id.isDisplayed();

    }
    public void VerifyPracticeFormIsDisplayed(){
        SeleniumPracticeForm_id.isDisplayed();
    }

    public void VerifyNameIsInserted(){
        InsertName_id.isSelected();
        InsertName_id.sendKeys("Keishia");

    }

    public void VerifyEmailIsInserted(){
        InsertEmail_id.click();
        InsertEmail_id.sendKeys("kb@gmail.com");

    }

    public void VerifyAgeIsInserted(){
        InsertAge_id.isSelected();
        InsertAge_id.sendKeys("50");
    }

    public void VerifyGenderIsSelected(){
        InsertGender_id.isSelected();
        InsertFemale_id.click();

    }

    public void VerifyCountry(){
        InsertCountry_id.isSelected();
        InsertCountryName_id.click();

    }

    public void VerifyExperience(){
        InsertExperienceLevel_id.isSelected();
        InsertLevel_id.click();

    }

    public void VerifySkill(){
        SelectSkill_id.isSelected();

    }

    public void InsertComments(){
        InsertComment_id.isSelected();
        InsertComment_id.sendKeys("Testing New Framework");

    }

    public void SelectTermsAndConditions(){
        SelectTermsAndConditions_id.isSelected();

    }

    public void VerifyFormIsSelected(){
        SubmitForm.isSelected();
    }













}
