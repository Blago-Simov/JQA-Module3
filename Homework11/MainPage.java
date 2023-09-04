package Homework11;

import Helpers.WaitHelper;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class MainPage {

    public WebDriver driver;
    WaitHelper helper;

    @FindBy(how = How.XPATH, using = "//*[@class='element-group'][1]/div/ul/li[5]")
    WebElement elementsListButtonsPanel;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        helper = new WaitHelper(driver);
    }


    public ButtonsPageWithCustomExpectedConditions loadButtonsPage() {
        helper.customWaitForElement(elementsListButtonsPanel, 20);
        (elementsListButtonsPanel).click();
        Assert.assertEquals("https://demoqa.com/buttons", driver.getCurrentUrl());
        return new ButtonsPageWithCustomExpectedConditions(driver);
    }

}
