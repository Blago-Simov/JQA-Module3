package Homework11;

import Helpers.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class ButtonsPageWithCustomExpectedConditions {


    public WebDriver driver;
    Actions act;

    WaitHelper helper;
    @FindBy(how = How.ID, using = "doubleClickBtn")
    WebElement doubleClickButton;
    @FindBy(how = How.ID, using = "rightClickBtn")
    WebElement rightClickButton;
    @FindBy(how = How.XPATH, using = "/html[1]//div[3]/button[1]")
    WebElement dynamicClickButton;
    @FindBy(how = How.CSS, using = "div > p#doubleClickMessage")
    WebElement doubleClickMessage;
    @FindBy(how = How.CSS, using = "div > p#rightClickMessage")
    WebElement rightClickMessage;
    @FindBy(how = How.CSS, using = "div > p#dynamicClickMessage")
    WebElement dynamicClickMessage;

    public ButtonsPageWithCustomExpectedConditions(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        helper = new WaitHelper(driver);
    }


    public void doubleClick() {
        act = new Actions(driver);
        helper.waitForElement(doubleClickButton, 20);
        act.doubleClick((doubleClickButton)).perform();
    }

    public void rightClick() {
        act = new Actions(driver);
        helper.waitForElement(rightClickButton, 20);
        act.contextClick((rightClickButton)).perform();
    }

    public void dynamicClick() {
        helper.waitForElement(dynamicClickButton, 20);
        dynamicClickButton.click();
    }

    public String doubleClickMessage() {
        helper.customWaitForElement(doubleClickMessage, 20);
        return (doubleClickMessage).getText();

    }

    public String rightClickMessage() {
        helper.customWaitForElement(rightClickMessage, 20);
        return (rightClickMessage).getText();

    }

    public String dynamicClickMessage() {
        helper.customWaitForElement(dynamicClickMessage, 20);
        return (dynamicClickMessage).getText();
    }
}
