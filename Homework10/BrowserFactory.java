package Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
     WebDriver driver;
 public BrowserFactory(WebDriver driver){

     this.driver = driver;
  }
    public static  WebDriver getBrowser(String browserName){

       WebDriver driver = null;

       switch(browserName){
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "E:\\installers\\drivers\\Chromedriver\\chromedriver.exe");
                return driver =  new ChromeDriver();

            case "Firefox":
                System.setProperty("webdriver.gecko.driver", "E:\\installers\\drivers\\geckodriver-v0.27.0-win64\\geckodriver.exe");
                return driver = new FirefoxDriver();

            case "Edge":
                System.setProperty("webdriver.edge.driver", "E:\\installers\\drivers\\Edgedriver\\msedgedriver.exe");
                return   driver = new EdgeDriver();
            default:
                throw  new IllegalArgumentException("Undefined or unsupported browser type" + browserName);
        }

    }

}
