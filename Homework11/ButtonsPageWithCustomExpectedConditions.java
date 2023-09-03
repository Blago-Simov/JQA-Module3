package Homework11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPageWithCustomExpectedConditions {


    public WebDriver driver;
    Actions act;

    WebDriverWait wait;


    By doubleClickButton = By.id("doubleClickBtn");
    By rightClickButton = By.id("rightClickBtn");
    By dynamicClickButton = By.xpath("/html[1]//div[3]/button[1]");
    By doubleClickMessage = By.cssSelector("div > p#doubleClickMessage");
    By rightClickMessage = By.cssSelector("div > p#rightClickMessage");
    By dynamicClickMessage = By.cssSelector("div > p#dynamicClickMessage");

    public ButtonsPageWithCustomExpectedConditions(WebDriver driver) {
        this.driver = driver;
    }


    public void doubleClick() {
        act = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(doubleClickButton));
        act.doubleClick(driver.findElement(doubleClickButton)).perform();
    }

    public void rightClick() {
        act = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(rightClickButton));
        act.contextClick(driver.findElement(rightClickButton)).perform();
    }

    public void dynamicClick() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicClickButton));
        WebElement dynamicButton = driver.findElement(dynamicClickButton);
        dynamicButton.click();
    }

    public String doubleClickMessage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until((ExpectedCondition<Boolean>) driver -> {
            WebElement element = driver.findElement(doubleClickMessage);
            if(element!=null){
                return element.isEnabled() && element.isDisplayed();
            }
            return false;
        });
        return driver.findElement(doubleClickMessage).getText();

    }

    public String rightClickMessage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until((ExpectedCondition<Boolean>) driver -> {
            WebElement element = driver.findElement(rightClickMessage);
            if(element!=null){
                return element.isEnabled() && element.isDisplayed();
            }
            return false;
        });
        return driver.findElement(rightClickMessage).getText();

    }

    public String dynamicClickMessage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until((ExpectedCondition<Boolean>) driver -> {
            WebElement element = driver.findElement(dynamicClickMessage);
            if(element!=null){
                return element.isEnabled() && element.isDisplayed();
            }
            return false;
        });
        return driver.findElement(dynamicClickMessage).getText();
    }
}
       
