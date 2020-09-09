package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//a[@class='login']")
    private WebElement signInButton;

    public HomePage() {
    }

    public void clickSignInButton() {
        signInButton.click();
    }

}
