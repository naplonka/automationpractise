import org.junit.Before;
import org.junit.Test;
import pages.PageObjectManager;

import static org.assertj.core.api.Assertions.assertThat;


public class RegistrationTest  extends AbstractChromeDriverTest{
    private PageObjectManager pageManager;

    public RegistrationTest() {
        super();
    }

    @Before
    public void setUp(){
        pageManager = new PageObjectManager(driver, storeConfig);
        pageManager.goToHomePage();
    }

    @Test
    public void registrationTest () {
        pageManager.getHomePage().clickSignInButton();
        assertThat(pageManager.getSingInPage().actualInfoMessage()).isEqualTo("Please enter your email address to create an account.");

        pageManager.getSingInPage().fillInEmailCreatedField();
        assertThat(pageManager.getSingInPage().isValidateClassIsPresent()).isTrue();
        String createdEmail = pageManager.getSingInPage().emailField.getText();

        pageManager.getSingInPage().clickOnCreateOnAnAccountButton();
        assertThat(driver.getCurrentUrl()
                .contentEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation"));

        pageManager.getCreateAnAccountPage().clickOnMrRadioButton();
        pageManager.getCreateAnAccountPage().fillInNameField();
        pageManager.getCreateAnAccountPage().fillInLastNameField();
        assertThat(pageManager.getCreateAnAccountPage().emailField.getText().contentEquals(createdEmail));
        pageManager.getCreateAnAccountPage().fillInPasswordField();
        pageManager.getCreateAnAccountPage().selectDay();
        pageManager.getCreateAnAccountPage().selectMonth();
        pageManager.getCreateAnAccountPage().selectYear();
        pageManager.getCreateAnAccountPage().clickOnNewsletter();
        pageManager.getCreateAnAccountPage().clickOnOption();
        pageManager.getCreateAnAccountPage().fillInFirstNameAddress();
        pageManager.getCreateAnAccountPage().fillInLastNameAddress();
        pageManager.getCreateAnAccountPage().fillInCompany();
        pageManager.getCreateAnAccountPage().fillInAddress();
        pageManager.getCreateAnAccountPage().fillInAddressSecondLine();
        pageManager.getCreateAnAccountPage().fillInCity();
        pageManager.getCreateAnAccountPage().selectState();
        pageManager.getCreateAnAccountPage().selectCountry();
        pageManager.getCreateAnAccountPage().fillInAdditionalInfo();
        pageManager.getCreateAnAccountPage().fillInAlias();
        pageManager.getCreateAnAccountPage().fillInHomePhone();
        pageManager.getCreateAnAccountPage().fillInMobilePhone();
        pageManager.getCreateAnAccountPage().clickOnRegister();

    }
}