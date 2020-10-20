package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.TextCreator;

public class CreateAnAccountPage extends PageObject {
    public CreateAnAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "id_gender2")
    private WebElement mrsGender;

    @FindBy(id = "id_gender1")
    private WebElement mrGender;

    @FindBy(id = "customer_firstname")
    private WebElement firstNameField;

    @FindBy(id = "customer_lastname")
    private WebElement lastNameField;

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "days")
    private Select daysSelect;

    @FindBy(id = "days")
    private WebElement daysWebelement;

    @FindBy(id = "months")
    private Select monthsSelect;

    @FindBy(id = "years")
    private Select yearsSelect;

    @FindBy(id = "newsletter")
    private WebElement newsletterRadioButton;

    @FindBy(id = "optin")
    private WebElement optionRadioButton;

    @FindBy(id = "firstname")
    private WebElement firstNameAddressField;

    @FindBy(id = "lastname")
    private WebElement lastNameAddressField;

    @FindBy(id = "company")
    private WebElement companyField;

    @FindBy(id = "address1")
    private WebElement addressFirstLineField;

    @FindBy(id = "address2")
    private WebElement addressSecondLineField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id = "id_state")
    private Select stateSelectList;

    @FindBy(id = "postcode")
    private WebElement postcodeField;

    @FindBy(id = "id_country")
    private Select countrySelectList;

    @FindBy(id = "other")
    private WebElement otherTextArea;

    @FindBy(id = "phone")
    private WebElement homePhoneField;

    @FindBy(id = "phone_mobile")
    private WebElement phoneMobileField;

    @FindBy(id = "alias")
    private WebElement aliasField;

    @FindBy(xpath = "//*[@id='submitAccount']/span")
    private WebElement submitAccountButton;


    public void clickOnMrRadioButton(){
        waitForElementToBeDisplayed(mrGender);
        mrGender.click();
    }

    public void clickOnMrsRadioButton(){
        waitForElementAndClick(mrsGender);
    }

    public void fillInNameField(){
        waitForElementAndSendKeys(firstNameField, TextCreator.nameGenerator());
    }

    public void fillInLastNameField(){
        waitForElementAndSendKeys(lastNameField, TextCreator.nameGenerator());
    }

    public void fillInPasswordField(){
        waitForElementAndSendKeys(passwordField, TextCreator.nameGenerator() + "password");
    }

    public void selectDay(){
        daysWebelement.click();
        daysSelect.selectByIndex(2);
    }

    public void selectMonth(){
        monthsSelect.selectByIndex(2);
    }

    public void selectYear(){
        yearsSelect.selectByIndex(1);
    }

    public void clickOnNewsletter() {
        waitForElementAndClick(newsletterRadioButton);
    }

    public void clickOnOption(){
        waitForElementAndClick(optionRadioButton);
    }

    public void fillInFirstNameAddress(){
        waitForElementAndSendKeys(firstNameAddressField, TextCreator.nameGenerator() + "firstAddress");
    }

    public void fillInLastNameAddress(){
        waitForElementAndSendKeys(lastNameAddressField, TextCreator.nameGenerator() + "lastAddress");
    }

    public void fillInCompany(){
        waitForElementAndSendKeys(companyField, TextCreator.nameGenerator() + "company");
    }

    public void fillInAddress(){
        waitForElementAndSendKeys(addressFirstLineField, TextCreator.nameGenerator() + "address");
    }

    public void fillInAddressSecondLine(){
        waitForElementAndSendKeys(addressSecondLineField, TextCreator.nameGenerator() + "address2");
    }

    public void fillInCity(){
        waitForElementAndSendKeys(cityField, TextCreator.nameGenerator() + "City");
    }

    public void selectState(){
        stateSelectList.selectByIndex(2);
    }

    public void fillInPostCode(){
        waitForElementAndSendKeys(postcodeField, TextCreator.nameGenerator());
    }

    public void selectCountry(){
        countrySelectList.selectByIndex(1);
    }

    public void fillInAdditionalInfo(){
        waitForElementAndSendKeys(otherTextArea, TextCreator.nameGenerator());
    }

    public void fillInHomePhone(){
        waitForElementAndSendKeys(homePhoneField, TextCreator.nameGenerator());
    }

    public void fillInMobilePhone(){
        waitForElementAndSendKeys(phoneMobileField, TextCreator.nameGenerator());
    }

    public void fillInAlias(){
        waitForElementAndSendKeys(aliasField, TextCreator.nameGenerator());
    }

    public void clickOnRegister() {
        waitForElementAndClick(submitAccountButton);
    }
}
