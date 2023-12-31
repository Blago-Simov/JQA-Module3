package Homework10PoM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage {
    WebDriver driver;

    By doubleClickButton = By.id("doubleClickBtn");
    By rightClickButton = By.id("rightClickBtn");
    By dynamicClickButton = By.xpath("/html[1]//div[3]/button[1]");
    By doubleClickMessage = By.cssSelector("div > p#doubleClickMessage");
    By rightClickMessage = By.cssSelector("div > p#rightClickMessage");
    By dynamicClickMessage = By.cssSelector("div > p#dynamicClickMessage");

    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    Actions act;

    public void doubleClick() {
        act = new Actions(driver);
        act.doubleClick(driver.findElement(doubleClickButton)).perform();
    }

    public void rightClick() {
        act = new Actions(driver);
        act.contextClick(driver.findElement(rightClickButton)).perform();
    }

    public void dynamicClick() {
        WebElement dynamicButton = driver.findElement(dynamicClickButton);
        dynamicButton.click();
    }

    public String doubleClickMessage() {
        return driver.findElement(doubleClickMessage).getText();

    }

    public String rightClickMessage() {
        return driver.findElement(rightClickMessage).getText();

    }

    public String dynamicClickMessage() {
        return driver.findElement(dynamicClickMessage).getText();
    }
}
