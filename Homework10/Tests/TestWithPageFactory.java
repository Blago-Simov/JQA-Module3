package Homework10Pagefactory;

import org.junit.Assert;
import org.junit.Test;


public class TestWithPageFactory extends DriverSetUpAndTearDown {

    BaseFactoryPage baseFactoryPage;
    TextBoxFactoryPage textBoxFactoryPage;
    RadioButtonFactoryPage radioButtonFactoryPage;
    ButtonsFactoryPage buttonsFactoryPage;


    @Test
    public void successfullyFilledTextBoxFields() {
        baseFactoryPage = new BaseFactoryPage(driver);
        textBoxFactoryPage = baseFactoryPage.loadTextBoxFactoryPage();
        baseFactoryPage.loadTextBoxFactoryPage();
        textBoxFactoryPage.enterFullName("John Travolta");
        textBoxFactoryPage.enterEmail("jt@abv.bg");
        textBoxFactoryPage.enterCurrentAddress("Paris");
        textBoxFactoryPage.enterPermanentAddress("Paris");
        textBoxFactoryPage.clickOnSubmit();
        Assert.assertEquals("Name:John Travolta", textBoxFactoryPage.getResultName());
        Assert.assertEquals("Email:jt@abv.bg", textBoxFactoryPage.getResultEmail());
        Assert.assertEquals("Current Address :Paris", textBoxFactoryPage.getResultCurrentAddress());
        Assert.assertEquals("Permananet Address :Paris", textBoxFactoryPage.getResultPermanentAddress());
    }

    @Test
    public void checkRadioButtonsOnRadioButtonPage() {
        baseFactoryPage = new BaseFactoryPage(driver);
        radioButtonFactoryPage = baseFactoryPage.loadRadioButtonFactoryPage();
        baseFactoryPage.loadRadioButtonFactoryPage();
        radioButtonFactoryPage.clickOnYesButton();
        Assert.assertEquals("You have selected Yes", radioButtonFactoryPage.resultTextField());
        radioButtonFactoryPage.clickOnImpressiveButton();
        Assert.assertEquals("You have selected Impressive", radioButtonFactoryPage.resultTextField());
        Assert.assertFalse(radioButtonFactoryPage.IsNoButtonEnabled());
    }

    @Test

    public void checkButtonsOnButtonsPage() {
        baseFactoryPage = new BaseFactoryPage(driver);
        buttonsFactoryPage = baseFactoryPage.loadButtonsFactoryPage();
        baseFactoryPage.loadButtonsFactoryPage();
        buttonsFactoryPage.rightClick();
        buttonsFactoryPage.doubleClick();
        buttonsFactoryPage.dynamicClick();
        Assert.assertEquals("You have done a dynamic click", buttonsFactoryPage.dynamicClickMessage());
        Assert.assertEquals("You have done a right click", buttonsFactoryPage.rightClickMessage());
        Assert.assertEquals("You have done a double click", buttonsFactoryPage.doubleClickMessage());
    }


}
