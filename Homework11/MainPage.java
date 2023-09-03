package Homework11;

import Helpers.WaitHelper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    public static WebDriver driver;

    public WebDriverWait wait;

    WaitHelper waitHelper;
    By elementsListButtonsPanel = By.xpath("//*[@class='element-group'][1]/div/ul/li[5]");

    public MainPage(WebDriver driver) {
        MainPage.driver = driver;
    }


    public ButtonsPageWithCustomExpectedConditions loadButtonsPage() {
        waitHelper.customWait((WebElement) elementsListButtonsPanel,20);
        driver.findElement(elementsListButtonsPanel).click();
        Assert.assertEquals("https://demoqa.com/buttons", driver.getCurrentUrl());
        return new ButtonsPageWithCustomExpectedConditions(driver);
    }

}
