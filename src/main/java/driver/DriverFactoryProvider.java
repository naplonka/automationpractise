package driver;

import org.openqa.selenium.WebDriver;

public class DriverFactoryProvider {
    public static WebDriver driver;

    public static DriverFactory getDriverFactory(String browserType) {
        switch (browserType) {
            case "chrome":
                return new ChromeBrowser();
//            case "firefox":
//                new FireFireBrowser();
            default:
                throw new IllegalStateException("Unknown browser type! Please check your configuration");
        }

    }
}
