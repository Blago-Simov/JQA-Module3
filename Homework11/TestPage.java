package Homework11;

import Helpers.StartAndCloseDriver;
import org.junit.Assert;
import org.junit.Test;

//StartAndCloseDriver Class is a helper from Homework10
public class TestPage extends StartAndCloseDriver {
    MainPage page;
    ButtonsPageWithCustomExpectedConditions buttonsPage;

    @Test
    public void checkButtonsOnButtonsPage() {
        page = new MainPage(driver);
        buttonsPage = page.loadButtonsPage();
        page.loadButtonsPage();
        buttonsPage.rightClick();
        buttonsPage.doubleClick();
        buttonsPage.dynamicClick();
        Assert.assertEquals("You have done a dynamic click", buttonsPage.dynamicClickMessage());
        Assert.assertEquals("You have done a right click", buttonsPage.rightClickMessage());
        Assert.assertEquals("You have done a double click", buttonsPage.doubleClickMessage());
    }

}
