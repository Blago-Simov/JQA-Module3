package Homework10Pagefactory;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class BaseFactoryPage {

    WebDriver driver;

    @FindBy(how = How.XPATH,using = "//*[@class='element-group'][1]/div/ul/li[1]")
    WebElement elementsListTextBoxPanel;

    @FindBy(how = How.XPATH,using ="//*[@class='element-group'][1]/div/ul/li[3]")
    WebElement elementsListRadioButtonPanel;
    @FindBy(how = How.XPATH,using ="//*[@class='element-group'][1]/div/ul/li[5]")
    WebElement elementsListButtonsPanel;


    public BaseFactoryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public TextBoxFactoryPage loadTextBoxFactoryPage(){
        elementsListTextBoxPanel.click();
        Assert.assertEquals("https://demoqa.com/text-box",driver.getCurrentUrl());
        return new TextBoxFactoryPage(driver);

    }
    public RadioButtonFactoryPage loadRadioButtonFactoryPage(){
        elementsListRadioButtonPanel.click();
        Assert.assertEquals("https://demoqa.com/radio-button",driver.getCurrentUrl());
        return new RadioButtonFactoryPage(driver);
    }
    public ButtonsFactoryPage loadButtonsFactoryPage(){
        elementsListButtonsPanel.click();
        Assert.assertEquals("https://demoqa.com/buttons",driver.getCurrentUrl());
        return new ButtonsFactoryPage(driver);
    }
}
