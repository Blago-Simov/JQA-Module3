package Homework11;

import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestWithImplicitWait {
    static FirefoxDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.gecko.driver", "E:\\installers\\drivers\\geckodriver-v0.27.0-win64\\geckodriver.exe");

        driver = new FirefoxDriver();

        driver.get("https://demoqa.com/text-box");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}
