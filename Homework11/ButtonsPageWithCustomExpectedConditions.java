package Homework11;

import Helpers.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPageWithCustomExpectedConditions {


    public WebDriver driver;

    Actions act;
    //WaitHelper Class from Homework10 Helpers 
    WaitHelper helper;

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
        helper.waitForElement((WebElement) doubleClickButton, 30);
        act.doubleClick(driver.findElement(doubleClickButton)).perform();
    }

    public void rightClick() {
        act = new Actions(driver);
        helper.waitForElement((WebElement) rightClickButton, 30);
        act.contextClick(driver.findElement(rightClickButton)).perform();
    }

    public void dynamicClick() {
        helper.waitForElement((WebElement) dynamicClickButton, 30);
        WebElement dynamicButton = driver.findElement(dynamicClickButton);
        dynamicButton.click();
    }

    public String doubleClickMessage() {
        helper.customWait((WebElement) doubleClickMessage,30);
        return driver.findElement(doubleClickMessage).getText();

    }

    public String rightClickMessage() {
        helper.customWait((WebElement) rightClickMessage,30);
        return driver.findElement(rightClickMessage).getText();

    }

    public String dynamicClickMessage() {
        helper.customWait((WebElement) dynamicClickMessage,30);
        return driver.findElement(dynamicClickMessage).getText();
    }
}
   
