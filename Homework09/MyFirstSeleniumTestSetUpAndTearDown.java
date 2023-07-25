package Homework09;
import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MyFirstSeleniumTestSetUpAndTearDown {

    static ChromeDriver driver;
    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\installers\\drivers\\Chromedriver\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

        driver.manage().window().maximize();
    }
    @After
    public  void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}
