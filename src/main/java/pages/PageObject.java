package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {

    private final String JS_SCROLL_DOWN = "scroll(0, 250);";
    private final String WINDOW_OPEN = "window.open();";
    private final String DOWNLOADS_URL = "chrome://downloads/";
    private final int OPEN_NEW_TAB = 1;
    private final int BACK_TO_PREVIOUS_TAB = 0;
    private final String JS_SCROLL_UP = "scroll(0, -250);";

    final int TIMEOUT = 10;
    final WebDriver driver;
    WebDriverWait wait;

    public PageObject(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT);
    }

    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToBeDisplayed(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementDisappear(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitForUrlToBePresent(String expectedUrl) {
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
    }

    public void waitForElementAndClick(WebElement element) {
        waitForElementToBeClickable(element);
        element.click();
    }

    public void waitForElementAndSendKeys(WebElement element, String text) {
        waitForElementToBeClickable(element);
        element.clear();
        element.sendKeys(text);
    }

    public String getTextFromElement(WebElement element) {
        waitForElementToBeDisplayed(element);
        return element.getText();
    }

    public boolean isElementEnable(WebElement element) {
        try {
            element.isEnabled();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
