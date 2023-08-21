package Homework10PoM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {

    WebDriver driver;

    By yesRadioButton = By.cssSelector("#yesRadio");
    By impressiveRadioButton = By.id("impressiveRadio");
    By noRadioButton = By.id("noRadio");
    By resultText = By.xpath("//*[@class='mt-3']");

    public RadioButtonPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnYesButton(){
        WebElement yesButton = driver.findElement(yesRadioButton);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", yesButton);

    }

    public void clickOnImpressiveButton(){
        WebElement impressiveButton = driver.findElement(impressiveRadioButton);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", impressiveButton);
    }

    public boolean IsNoButtonEnabled(){
        return driver.findElement(noRadioButton).isEnabled();
    }
    public String resultTextField(){
       return   driver.findElement(resultText).getText();

    }
}
