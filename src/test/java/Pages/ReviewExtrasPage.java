package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ReviewExtrasPage {
    WebDriver driver;

    @FindBy(id = "shipping-option-express")
    WebElement shippingExpress_id;

    @FindBy(id = "breakdown-shipping-value")
    WebElement validateShipping_id;

    @FindBy(id = "warranty-none")
    WebElement selectWarrantyNone_id;

    @FindBy(id = "breakdown-warranty-value")
    WebElement noneWarrantyAmount_id;

    @FindBy(id = "warranty-option-1yr")
    WebElement oneYearWarranty_id;

    @FindBy(id = "warranty-option-2yr")
    WebElement twoYearWarranty_id;

    @FindBy(id = "discount-code")
    WebElement enterDiscountCode_id;

    @FindBy(id = "apply-discount-btn")
    WebElement selectAppyDiscountCode_id;

    @FindBy(id = "breakdown-subtotal-value")
    WebElement subTotal_id;

    @FindBy(id = "breakdown-discount-value")
    WebElement discountValue_id;

    @FindBy(id = "breakdown-total-value")
    WebElement totalValue_id;

    @FindBy (id = "discount-feedback")
    WebElement discountMessage_id;


    public ReviewExtrasPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ShippingOptionExpress() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(shippingExpress_id));
        shippingExpress_id.click();
    }

    public String ValidateShippingCost() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(validateShipping_id));
        return validateShipping_id.getText().trim();

    }

    public void SelectWarrantyNone() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(selectWarrantyNone_id));
        selectWarrantyNone_id.click();
    }

    public String ValidateNoneWarrantyAmount() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(selectWarrantyNone_id));
        return noneWarrantyAmount_id.getText().trim();

    }

    public void SelectOneYearWarranty() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(oneYearWarranty_id));
        oneYearWarranty_id.click();
    }

    public String VerifyOneYearWarrantyAmount() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(oneYearWarranty_id));
        return noneWarrantyAmount_id.getText().trim();

    }

    public void SelectTwoYearWarranty() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(twoYearWarranty_id));
        twoYearWarranty_id.click();

    }

    public String VerifyTwoYearWarrantyAmount() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(twoYearWarranty_id));
        return noneWarrantyAmount_id.getText().trim();
    }

    public void EnterDiscountCode(String discountCode) {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(enterDiscountCode_id));
        enterDiscountCode_id.sendKeys(discountCode);
    }

    public void SelectToApplyDiscountCode() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(selectAppyDiscountCode_id));
        selectAppyDiscountCode_id.click();
    }

    public String SelectToApplyDiscountCodeMessage() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(discountMessage_id));
        discountMessage_id.click();
        return driver.findElement(By.id("discount-feedback")).getText();
    }


    public String VerifySubTotal() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(subTotal_id));
        return driver.findElement(By.id("breakdown-subtotal-value")).getText();
    }

    public String VerifyDiscountValue() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(discountValue_id));
        return driver.findElement(By.id("breakdown-discount-value")).getText();
    }

    public String VerifyTotalValue() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(visibilityOf(totalValue_id));
        return driver.findElement(By.id("breakdown-total-value")).getText();
    }
}

