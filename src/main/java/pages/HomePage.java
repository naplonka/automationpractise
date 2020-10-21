package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(xpath = "//a[@class='login']")
    private WebElement signInButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInButton() {
        signInButton.click();
        waitForUrlToBePresent("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

}
