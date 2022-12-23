package testSuite;

import Pages.HomePage;
import Pages.itemPage;
import Pages.resultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addItem_ToCart extends TestBase {
    HomePage homeObject;
    itemPage pageObject;
    resultsPage resultsPageObject;
    String nameOfItem = "car accessories";

    @Test(priority = 1)
    public void userCanSearchForItem(){
        homeObject = new HomePage(driver);
        homeObject.search(nameOfItem);
        Assert.assertTrue(homeObject.results.getText()
                .contains(nameOfItem));

    }
    @Test(priority = 2)
    public void userCanAddItemToCart(){
        resultsPageObject = new resultsPage(driver);
        resultsPageObject.clickOnItem();
        pageObject = new itemPage(driver);
        pageObject.addToCart();
        pageObject.checkCart();
        Assert.assertTrue(pageObject.total.isDisplayed());
    }
}
