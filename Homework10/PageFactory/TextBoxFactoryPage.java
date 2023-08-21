package Homework10Pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TextBoxFactoryPage {
    WebDriver driver;

    @FindBy(how = How.ID,using = "userName" )
    WebElement fullNameTextBox;
    @FindBy(how = How.ID,using = "userEmail" )
    WebElement userEmailTextBox ;
    @FindBy(how = How.XPATH,using ="//*[@id=\"currentAddress\"]" )
    WebElement currentAddressTextBox;
    @FindBy(how = How.ID,using = "permanentAddress")
    WebElement permanentAddressTextBox;
    @FindBy(how = How.CSS,using = "button.btn-primary" )
    WebElement submitButton;
    @FindBy(how = How.CSS,using = "p#name")
    WebElement nameResult ;
    @FindBy(how = How.CSS,using = "p#email")
    WebElement emailResult;
    @FindBy(how = How.CSS,using = "p#currentAddress")
    WebElement currentAddressResult;
    @FindBy(how = How.CSS,using = "p#permanentAddress" )
    WebElement permanentAddressResult;

    public TextBoxFactoryPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void enterFullName(String name){fullNameTextBox.sendKeys(name);
    }

    public void enterEmail(String email){
        userEmailTextBox.sendKeys(email);
    }

    public void enterCurrentAddress(String currentAddress){
        currentAddressTextBox.sendKeys(currentAddress);
    }

    public void enterPermanentAddress(String permanentAddress){
        permanentAddressTextBox.sendKeys(permanentAddress);
    }


    public  void clickOnSubmit(){
        submitButton.click();
    }

    public String getResultName(){
        return nameResult.getText();

    }
    public String getResultEmail(){
        return  emailResult.getText();

    }
    public String getResultCurrentAddress(){
        return currentAddressResult.getText();

    }

    public String getResultPermanentAddress(){
        return permanentAddressResult.getText();

    }
}
