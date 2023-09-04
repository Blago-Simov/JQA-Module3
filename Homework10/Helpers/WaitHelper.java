package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

    public WebDriver driver;
    public WebDriverWait wait;
    public WaitHelper(WebDriver _driver){
        driver = _driver;
    }

    public void waitForElement(WebElement element,int timeOfSeconds){
        wait = new WebDriverWait(driver,timeOfSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void customWaitForElement(WebElement el,int timeOfSeconds){
        wait = new WebDriverWait(driver,timeOfSeconds);
        wait.until((ExpectedCondition<Boolean>) driver -> {
            WebElement element;
            element = (el);
            if (element != null) {
                return element.isEnabled() && element.isDisplayed();
            }
            return false;
        });

    }
}
