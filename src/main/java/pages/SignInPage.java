package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.TextCreator;

public class SignInPage extends  PageObject{

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email_create")
    private WebElement emailCreateField;

    @FindBy(xpath = "//i[@class='icon-user left']")
    private WebElement createAnAccountButton;

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(xpath = "//p[@class='lost_password form-group']")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//i[@class='icon-lock left']")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@id='create-account_form']/div/p")
    private WebElement infoMessage;

    @FindBy(xpath = "//*[@id='create-account_form']/div/div[2]")
    private WebElement validateClass;

    public void fillInEmailCreatedField() {
        waitForElementAndSendKeys(emailCreateField, TextCreator.emailGenerator());
    }

    public void clickOnCreateOnAnAccountButton() {
        waitForElementAndClick(createAnAccountButton);
    }

    public String actualInfoMessage() {
        waitForElementToBeDisplayed(infoMessage);
        return infoMessage.getText();
    }

    public boolean isValidateClassIsPresent() {
        return validateClass.isDisplayed();
    }
}
