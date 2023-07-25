package Homework08;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DemoQASeleniumTest {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "E:\\installers\\drivers\\Chromedriver\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

        driver.manage().window().maximize();

        WebElement userNameTextBox = driver.findElement(By.cssSelector("input#userName"));
        userNameTextBox.sendKeys("Mat Daemon");

        WebElement userEmailTextBox = driver.findElement(By.id("userEmail"));
        userEmailTextBox.sendKeys("matd@abv.bg");

        WebElement currentAddressTextBox = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
        currentAddressTextBox.sendKeys("Fifth avenue str.");

        WebElement permanentAddressTextBox = driver.findElement(By.id("permanentAddress"));
        permanentAddressTextBox.sendKeys("Los Angels");

        WebElement submitButton = driver.findElementByCssSelector("button.btn-primary");
        submitButton.click();

        boolean isPassed = false ;
        List<WebElement> resultBox = driver.findElements(By.cssSelector("div.border"));

        for (WebElement e : resultBox) {

            if(e.getText().contains("Name:Mat Daemon")
            &&(e.getText().contains("Email:matd@abv.bg")
            &&(e.getText().contains("Current Address :Fifth avenue str.")
            &&(e.getText().contains("Permananet Address :Los Angels"))))){
                isPassed = true;
            }
        }

        if(isPassed){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }

        driver.quit();
    }

