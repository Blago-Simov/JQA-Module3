package Homework10PoM;
import org.junit.Assert;
import org.junit.Test;


public class TestWithPom extends SetUpAndTearDown {

    BasePage basePage;
    TextBoxPage textBoxPage;
    ButtonsPage buttonsPage;
    RadioButtonPage radioButtonPage;

    @Test
    public void successfullyFilledTextBoxFields() {
        basePage = new BasePage(driver);
        textBoxPage = basePage.loadTextBoxpage();
        basePage.loadTextBoxpage();
        textBoxPage.enterFullName("Jonny Dep");
        textBoxPage.enterEmail("jd@abv.bg");
        textBoxPage.enterCurrentAddress("Miami");
        textBoxPage.enterPermanentAddress("Miami");
        textBoxPage.clickOnSubmit();
        Assert.assertEquals("Name:Jonny Dep", textBoxPage.getResultName());
        Assert.assertEquals("Email:jd@abv.bg", textBoxPage.getResultEmail());
        Assert.assertEquals("Current Address :Miami", textBoxPage.getResultCurrentAddress());
        Assert.assertEquals("Permananet Address :Miami", textBoxPage.getResultPermanentAddress());
    }

    @Test
    public void checkRadioButtonsOnRadioButtonPage() {
        basePage = new BasePage(driver);
        radioButtonPage = basePage.loadRadioButtonPage();
        basePage.loadRadioButtonPage();
        radioButtonPage.clickOnYesButton();
        Assert.assertEquals("You have selected Yes", radioButtonPage.resultTextField());
        radioButtonPage.clickOnImpressiveButton();
        Assert.assertEquals("You have selected Impressive", radioButtonPage.resultTextField());
        Assert.assertFalse(radioButtonPage.IsNoButtonEnabled());
    }

    @Test
    public void checkButtonsOnButtonsPage() {
        basePage = new BasePage(driver);
        buttonsPage = basePage.loadButtonsPage();
        basePage.loadButtonsPage();
        buttonsPage.rightClick();
        buttonsPage.doubleClick();
        buttonsPage.dynamicClick();
        Assert.assertEquals("You have done a dynamic click", buttonsPage.dynamicClickMessage());
        Assert.assertEquals("You have done a right click", buttonsPage.rightClickMessage());
        Assert.assertEquals("You have done a double click", buttonsPage.doubleClickMessage());
    }




}
