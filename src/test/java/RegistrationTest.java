import driver.DriverFactory;
import driver.DriverFactoryProvider;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegistrationTest {
    protected WebDriver driver;
    @Test
    public void registrationTest () {
        DriverFactory driverFactory = DriverFactoryProvider.getDriverFactory("chrome");
        driver = driverFactory.getDriver();
        driver.get("http://automationpractice.com/index.php");
    }
}