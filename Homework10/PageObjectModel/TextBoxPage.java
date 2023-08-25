package Homework10PoM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TextBoxPage {

    WebDriver driver;

    By fullNameTextBox = By.id("userName");
    By userEmailTextBox = By.id("userEmail");
    By currentAddressTextBox = By.xpath("//*[@id=\"currentAddress\"]");
    By permanentAddressTextBox = By.id("permanentAddress");
    By submitButton = By.cssSelector("button.btn-primary");
    By nameResult = By.cssSelector("p#name");
    By emailResult = By.cssSelector("p#email");
    By currentAddressResult = By.cssSelector("p#currentAddress");
    By permanentAddressResult = By.cssSelector("p#permanentAddress");

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }


    public void enterFullName(String name) {
        driver.findElement(fullNameTextBox).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(userEmailTextBox).sendKeys(email);
    }

    public void enterCurrentAddress(String currentAddress) {
        driver.findElement(currentAddressTextBox).sendKeys(currentAddress);
    }

    public void enterPermanentAddress(String permanentAddress) {
        driver.findElement(permanentAddressTextBox).sendKeys(permanentAddress);
    }


    public void clickOnSubmit() {
        driver.findElement(submitButton).click();
    }

    public String getResultName() {
        return driver.findElement(nameResult).getText();

    }

    public String getResultEmail() {
        return driver.findElement(emailResult).getText();

    }

    public String getResultCurrentAddress() {
        return driver.findElement(currentAddressResult).getText();

    }

    public String getResultPermanentAddress() {
        return driver.findElement(permanentAddressResult).getText();

    }

}
