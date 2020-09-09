package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser implements DriverFactory{

    @Override
    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        options.addArguments("--start-maximized");
        return new ChromeDriver();    }
}
