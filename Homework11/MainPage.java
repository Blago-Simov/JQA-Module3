package Homework11;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    public static WebDriver driver;

    By elementsListButtonsPanel = By.xpath("//*[@class='element-group'][1]/div/ul/li[5]");

    public MainPage(WebDriver driver) {
        MainPage.driver = driver;
    }


    public ButtonsPageWithCustomExpectedConditions loadButtonsPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until((ExpectedCondition<Boolean>) driver -> {
            WebElement element = driver.findElement(elementsListButtonsPanel);
            if(element!=null){
                return element.isEnabled() && element.isDisplayed();
            }
            return false;
        });
        driver.findElement(elementsListButtonsPanel).click();
        Assert.assertEquals("https://demoqa.com/buttons", driver.getCurrentUrl());
        return new ButtonsPageWithCustomExpectedConditions(driver);
    }

}
