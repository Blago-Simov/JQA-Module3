package Homework10PoM;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public static WebDriver driver;

    By elementsListTextBoxPanel = By.xpath("//*[@class='element-group'][1]/div/ul/li[1]");
    By elementsListRadioButtonPanel = By.xpath("//*[@class='element-group'][1]/div/ul/li[3]");
    By elementsListButtonsPanel = By.xpath("//*[@class='element-group'][1]/div/ul/li[5]");

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }


    public TextBoxPage loadTextBoxpage() {
        driver.findElement(elementsListTextBoxPanel).click();
        Assert.assertEquals("https://demoqa.com/text-box", driver.getCurrentUrl());
        return new TextBoxPage(driver);
    }

    public RadioButtonPage loadRadioButtonPage() {
        driver.findElement(elementsListRadioButtonPanel).click();
        Assert.assertEquals("https://demoqa.com/radio-button", driver.getCurrentUrl());
        return new RadioButtonPage(driver);
    }

    public ButtonsPage loadButtonsPage() {
        driver.findElement(elementsListButtonsPanel).click();
        Assert.assertEquals("https://demoqa.com/buttons", driver.getCurrentUrl());
        return new ButtonsPage(driver);
    }

}
}
