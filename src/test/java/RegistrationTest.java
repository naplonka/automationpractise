import driver.DriverFactory;
import driver.DriverFactoryProvider;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.PageObjectManager;

public class RegistrationTest {

    private WebDriver driver;
    private PageObjectManager pageManager;

    @Before
    public void setUp(){
        DriverFactory driverFactory = DriverFactoryProvider.getDriverFactory("chrome");
        driver = driverFactory.getDriver();
        pageManager = new PageObjectManager(driver);
    }

    @Test
    public void registrationTest () {
        driver.get("http://automationpractice.com/index.php");
        pageManager.getHomePage().clickSignInButton();
    }
}