package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class WebAutomationAdvancePage {

    WebDriver driver;

    @FindBy(id = "inventory-title")
    WebElement inventoryHeader_id;

    @FindBy(id = "deviceType")
    WebElement deviceTypeDropDown_id;

    @FindBy(id = "brand")
    WebElement tabletBrand_id;

    @FindBy(id = "storage-64GB")
    WebElement storage_id;

    @FindBy(id = "color")
    WebElement color_id;

    @FindBy(id = "quantity")
    WebElement quantity_id;

    @FindBy(id = "address")
    WebElement address_id;

    @FindBy(id = "inventory-next-btn")
    WebElement nextButton_id;

    @FindBy(id = "shipping-option-express")
    WebElement shippingOption_id;

    @FindBy(id = "warranty-option-1yr")
    WebElement warrantyOption_id;

    @FindBy(id = "discount-code")
    WebElement discountCode_id;

    @FindBy(id = "apply-discount-btn")
    WebElement applyDiscountButton_id;

    @FindBy(id = "add-to-cart-btn")
    WebElement addToCartButton_id;

    @FindBy(id = "review-cart-btn")
    WebElement reviewCartButton_id;

    @FindBy(id = "confirm-cart-btn")
    WebElement confirmCartButton_id;

    @FindBy(id = "purchase-success-toast")
    WebElement purchaseSuccessToast_id;

    @FindBy(id = "view-history-btn")
    WebElement viewInvoiceButton_id;

    @FindBy(id = "invoice-history-panel")
    WebElement invoiceHistoryPanel_id;

    @FindBy(xpath = "/html/body/div/div/main/section/div[3]/div/div[2]/div/div[2]/div/div[3]/button[2]")
    WebElement downloadInvoiceButton_id;

    @FindBy (xpath = "/html/body/div/div/main/section/div[3]/div/div[2]/div/div[2]/div/div[3]/button[1]")
    WebElement getViewInvoiceButton_id;

    @FindBy(id ="close-invoice-history-btn")
    WebElement closeInvoiceHistoryButton_id;

    @FindBy(xpath ="/html/body/div/div/main/section/div[1]/button")
    WebElement logOutButton_id;

    @FindBy(id = "login-heading")
    WebElement loginHeading_id;

    @FindBy(id = "practice-heading")
    WebElement practiceHeading_id;

    public WebAutomationAdvancePage(WebDriver driver){
        this.driver=driver;
    }

    public void verifyInventoryHeaderIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(inventoryHeader_id));
        inventoryHeader_id.isDisplayed();
    }
    public void selectDeviceType(String deviceType){
        deviceTypeDropDown_id.sendKeys(deviceType);
    }

    public void selectTabletBrand(String deviceBrand){
        tabletBrand_id.sendKeys(deviceBrand);
    }

    public void selectStorage(String deviceStorage) {
        storage_id.click();
    }

    public void selectColor(String deviceColor) {
        color_id.sendKeys(deviceColor);
    }

    public void enterQuantity(String deviceQuantity) {
        quantity_id.clear();
        quantity_id.sendKeys(deviceQuantity);
    }

    public void deliveryAddress(String deliveryAddress) {
        address_id.clear();
        address_id.sendKeys(deliveryAddress);
    }

    public void clickNextButton() {
        nextButton_id.click();
    }


    public void selectShippingOption() {
        shippingOption_id.click();
    }

    public void selectWarrantyOption() {
        warrantyOption_id.click();
    }

    public void enterDiscountCode(String discountCode) {
        discountCode_id.sendKeys(discountCode);
    }

    public void clickApplyDiscountButton() {
        applyDiscountButton_id.click();
    }

    public void clickAddToCartButton() {
        addToCartButton_id.click();
    }

    public void clickReviewCartButton() {
        reviewCartButton_id.click();
    }

    public void clickConfirmCartButton() {
        confirmCartButton_id.click();
    }

    public void verifyPurchaseSuccessToastIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(purchaseSuccessToast_id));
        purchaseSuccessToast_id.isDisplayed();
    }

    public void clickViewInvoiceButton() {
        viewInvoiceButton_id.click();
    }

    public void verifyInvoiceHistoryPanelIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(invoiceHistoryPanel_id));
        invoiceHistoryPanel_id.isDisplayed();
    }

    public void clickDownloadInvoiceButton() {
        downloadInvoiceButton_id.click();
    }

    public void clickGetViewInvoiceButton() {
        getViewInvoiceButton_id.click();
    }

    public void clickCloseInvoiceHistoryButton() {
        closeInvoiceHistoryButton_id.click();
    }

    public void clickLogOutButton() {
        logOutButton_id.click();
    }

    public void verifyLoginHeadingIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginHeading_id));
        loginHeading_id.isDisplayed();
    }

    public void verifyPracticeHeadingIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(practiceHeading_id));
        practiceHeading_id.isDisplayed();
    }

}
