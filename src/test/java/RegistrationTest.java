import config.StoreConfig;
import org.junit.Before;
import org.junit.Test;

public class RegistrationTest extends AbstractChromeDriverTest {

    //This should be in page manager
    private StoreConfig config;


    @Test
    public void registrationTest () {
            driver.get("");
    }
}
