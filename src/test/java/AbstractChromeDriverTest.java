import config.StoreConfig;
import driver.DriverFactory;
import driver.DriverFactoryProvider;
import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SeleniumJupiter.class)

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
