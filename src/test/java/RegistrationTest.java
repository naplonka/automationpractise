import org.junit.Before;
import org.junit.Test;
import pages.PageObjectManager;


public class RegistrationTest  extends AbstractChromeDriverTest{

    private PageObjectManager pageManager;

    public RegistrationTest() {
        super();
    }

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