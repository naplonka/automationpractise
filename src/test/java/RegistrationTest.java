import config.StoreConfig;
import driver.DriverFactory;
import driver.DriverFactoryProvider;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.PageObjectManager;

public class RegistrationTest  extends AbstractChromeDriverTest{

    private PageObjectManager pageManager;

    @Before
    public void setUp(){
        pageManager = new PageObjectManager(driver, storeConfig);
    }

    @Test
    public void registrationTest () {
        pageManager.goToHomePage();
        pageManager.getHomePage().clickSignInButton();
    }
}