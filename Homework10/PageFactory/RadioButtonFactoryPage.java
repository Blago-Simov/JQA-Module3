package Homework10Pagefactory;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonFactoryPage {
    WebDriver driver;

    @FindBy(how = How.CSS, using = "#yesRadio")
    WebElement yesRadioButton;
    @FindBy(how = How.ID, using = "impressiveRadio")
    WebElement impressiveRadioButton;
    @FindBy(how = How.ID, using = "noRadio")
    WebElement noRadioButton;
    @FindBy(how = How.XPATH, using = "//*[@class='mt-3']")
    WebElement resultText;

    public RadioButtonFactoryPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnYesButton() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", yesRadioButton);

    }

    public void clickOnImpressiveButton() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", impressiveRadioButton);
    }

    public boolean IsNoButtonEnabled() {
        return (noRadioButton).isEnabled();
    }

    public String resultTextField() {
        return (resultText).getText();

    }
}
