package Homework10PoM;

import Helpers.BrowserFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SetUpAndTearDown {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = BrowserFactory.getBrowser("Firefox");

        if (driver != null) {
            driver.get("https://demoqa.com/elements");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();

        }


    }

    @After
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}
