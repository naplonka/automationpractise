package pages;

import config.StoreConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {

    private WebDriver driver;
    private HomePage homePage;
    private RegistrationPage registrationPage;
    private StoreConfig storeConfig;
    
    public PageObjectManager(WebDriver driver, StoreConfig storeConfig) {
        this.driver = driver;
        this.storeConfig = storeConfig;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = PageFactory.initElements(driver, HomePage.class);
        }
        return homePage;
    }

    public RegistrationPage getRegistrationPage() {
        if (registrationPage == null) {
            registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        }
        return registrationPage;
    }

    public void goToHomePage() {
        driver.get(storeConfig.getUrl());
    }
}
