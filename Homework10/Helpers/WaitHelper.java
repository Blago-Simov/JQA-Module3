package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

    public WebDriver driver;

    public WaitHelper(WebDriver driver){
        this.driver = driver;
    }
    public void waitForElement(WebElement element,long timeoutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver,timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public Boolean customWait(WebElement el,long TimeOutInSeconds){
       WebDriverWait wait = new WebDriverWait(driver, TimeOutInSeconds);
        wait.until((ExpectedCondition<Boolean>) driver -> {
            WebElement element = driver.findElement((By) el);
            if (element != null) {
                return element.isEnabled() && element.isDisplayed();

            }
            return false;
        });
        return null;
    }
}
