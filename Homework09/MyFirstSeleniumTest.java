package Homework09;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

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

        List<WebElement> resultBox = driver.findElements(By.cssSelector("div.border"));

        for (WebElement e : resultBox) {
            Assert.assertTrue(e.getText().contains("Name:Mat Daemon"));
            Assert.assertTrue(e.getText().contains("Email:matd@abv.bg"));
            Assert.assertTrue(e.getText().contains("Current Address :Fifth avenue str."));
            Assert.assertTrue(e.getText().contains("Permananet Address :Los Angels"));

        }

    }

    }




