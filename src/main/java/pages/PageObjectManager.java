package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {

    public WebDriver driver;
    public HomePage homePage;
    public RegistrationPage registrationPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
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
}
