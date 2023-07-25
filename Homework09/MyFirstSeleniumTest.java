package Homework09;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyFirstSeleniumTest extends MyFirstSeleniumTestSetUpAndTearDown {

    @Test
    public void successfullyFilledTextBoxField() {

        WebElement userNameTextBox = MyFirstSeleniumTestSetUpAndTearDown.driver.findElement(By.cssSelector("input#userName"));
        userNameTextBox.sendKeys("Mat Daemon");

        WebElement userEmailTextBox = MyFirstSeleniumTestSetUpAndTearDown.driver.findElement(By.id("userEmail"));
        userEmailTextBox.sendKeys("matd@abv.bg");

        WebElement currentAddressTextBox = MyFirstSeleniumTestSetUpAndTearDown.driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
        currentAddressTextBox.sendKeys("Fifth avenue str.");

        WebElement permanentAddressTextBox = MyFirstSeleniumTestSetUpAndTearDown.driver.findElement(By.id("permanentAddress"));
        permanentAddressTextBox.sendKeys("Los Angels");

        WebElement submitButton = MyFirstSeleniumTestSetUpAndTearDown.driver.findElementByCssSelector("button.btn-primary");
        submitButton.click();

        String nameResult = driver.findElement(By.cssSelector("p#name")).getText();
        String emailResult = driver.findElement(By.cssSelector("p#email")).getText();
        String currentAddressResult = driver.findElement(By.cssSelector("p#currentAddress")).getText();
        String permanentAddressResult = driver.findElement(By.cssSelector("p#permanentAddress")).getText();

        Assert.assertEquals("Name:Mat Daemon",nameResult);
        Assert.assertEquals("Email:matd@abv.bg",emailResult);
        Assert.assertEquals("Current Address :Fifth avenue str.",currentAddressResult);
        Assert.assertEquals("Permananet Address :Los Angels",permanentAddressResult);

    }

    }
   



