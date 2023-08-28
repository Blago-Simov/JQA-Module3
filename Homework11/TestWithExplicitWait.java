package Homework11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWithExplicitWait extends BaseTestWithImplicitWait {
    WebDriverWait wait;
    @Test
    public void successfullyFilledTextBoxField() {
        wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("input#userName"))));
        WebElement userNameTextBox = driver.findElement(By.cssSelector("input#userName"));
        userNameTextBox.sendKeys("Mat Daemon");

        wait.until(ExpectedConditions.presenceOfElementLocated((By.id("userEmail"))));
        WebElement userEmailTextBox = driver.findElement(By.id("userEmail"));
        userEmailTextBox.sendKeys("matd@abv.bg");

        wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//*[@id=\"currentAddress\"]"))));
        WebElement currentAddressTextBox = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
        currentAddressTextBox.sendKeys("Fifth avenue str.");

        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("permanentAddress"))));
        WebElement permanentAddressTextBox = driver.findElement(By.id("permanentAddress"));
        permanentAddressTextBox.sendKeys("Los Angels");

        wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector("button.btn-primary"))));
        WebElement submitButton =driver.findElement(By.cssSelector("button.btn-primary"));
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
