package Homework10PoM;
import Helpers.BrowserFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class TestWithPom  {

    static WebDriver driver;

    BasePage basePage;
    TextBoxPage textBoxPage;
    ButtonsPage buttonsPage;
    RadioButtonPage radioButtonPage;
    @Before
    public  void setUp() {
        driver = BrowserFactory.getBrowser("Chrome");

        driver.get("https://demoqa.com/elements");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().window().maximize();


    }

    @Test
    public void successfullyFilledTextBoxFields(){
        basePage = new BasePage(driver);
        textBoxPage = basePage.loadTextBoxpage();
        basePage.loadTextBoxpage();
        textBoxPage.enterFullName("Jonny Dep");
        textBoxPage.enterEmail("jd@abv.bg");
        textBoxPage.enterCurrentAddress("Miami");
        textBoxPage.enterPermanentAddress("Miami");
        textBoxPage.clickOnSubmit();
        Assert.assertEquals("Name:Jonny Dep",textBoxPage.getResultName());
        Assert.assertEquals("Email:jd@abv.bg",textBoxPage.getResultEmail());
        Assert.assertEquals("Current Address :Miami",textBoxPage.getResultCurrentAddress());
        Assert.assertEquals("Permananet Address :Miami",textBoxPage.getResultPermanentAddress());
    }
    @Test
    public void checkRadioButtonsOnRadioButtonPage(){
        basePage = new BasePage(driver);
        radioButtonPage = basePage.loadRadioButtonPage();
        basePage.loadRadioButtonPage();
        radioButtonPage.clickOnYesButton();
        Assert.assertEquals("You have selected Yes",radioButtonPage.resultTextField());
        radioButtonPage.clickOnImpressiveButton();
        Assert.assertEquals("You have selected Impressive",radioButtonPage.resultTextField());
        Assert.assertFalse(radioButtonPage.IsNoButtonEnabled());
    }

    @Test

    public void checkButtonsOnButtonsPage(){
        basePage = new BasePage(driver);
        buttonsPage = basePage.loadButtonsPage();
        basePage.loadButtonsPage();
        buttonsPage.rightClick();
        buttonsPage.doubleClick();
        buttonsPage.dynamicClick();
        Assert.assertEquals("You have done a dynamic click",buttonsPage.dynamicClickMessage());
        Assert.assertEquals("You have done a right click",buttonsPage.rightClickMessage());
        Assert.assertEquals("You have done a double click",buttonsPage.doubleClickMessage());
    }
    @After
    public  void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }


}
