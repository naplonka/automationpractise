import config.StoreConfig;
import driver.DriverFactory;
import driver.DriverFactoryProvider;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public abstract class AbstractChromeDriverTest {
    protected WebDriver driver;
    protected StoreConfig storeConfig;

        public AbstractChromeDriverTest() {
            super();
        }

        @Before
        public void beforeTest() {
            DriverFactory driverFactory = DriverFactoryProvider.getDriverFactory("chrome");
            driver = driverFactory.getDriver();
        }

        @After
        public void afterTest() {
            driver.quit();
        }
}
