package Homework10Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonsFactoryPage {


    WebDriver driver;

    @FindBy(how = How.ID,using="doubleClickBtn")
    WebElement doubleClickButton;
    @FindBy(how = How.ID,using = "rightClickBtn")
    WebElement rightClickButton ;
    @FindBy(how = How.XPATH,using = "/html[1]//div[3]/button[1]")
    WebElement dynamicClickButton;
    @FindBy(how = How.CSS,using = "div > p#doubleClickMessage")
    WebElement doubleClickMessage ;
    @FindBy(how = How.CSS,using = "div > p#rightClickMessage" )
    WebElement rightClickMessage ;
    @FindBy(how = How.CSS,using = "div > p#dynamicClickMessage" )
    WebElement dynamicClickMessage;

    public ButtonsFactoryPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void doubleClick(){
        Actions act = new Actions(driver);
        act.doubleClick((doubleClickButton)).perform();
    }
    public void rightClick(){
        Actions act = new Actions(driver);
        act.contextClick((rightClickButton)).perform();
    }
    public void dynamicClick(){
        dynamicClickButton.click();

    }

    public String doubleClickMessage(){
        return (doubleClickMessage).getText();

    }
    public String rightClickMessage(){
        return (rightClickMessage).getText();

    }
    public String dynamicClickMessage(){
       return  (dynamicClickMessage).getText();
    }
}
