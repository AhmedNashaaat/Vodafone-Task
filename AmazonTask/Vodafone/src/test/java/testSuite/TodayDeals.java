package testSuite;

import Pages.DealsPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class TodayDeals extends TestBase {
    HomePage homePageObject;
    DealsPage dealsPageObject;

    @Test
    public void userNavigateToDeals() throws InterruptedException {
        homePageObject = new HomePage(driver);
        homePageObject.openDeals();
        dealsPageObject = new DealsPage(driver);
        dealsPageObject.selectGroceryAndHeadphones();
        Thread.sleep(100);
        dealsPageObject.clickOnDiscount();
        dealsPageObject.navigateToPageThree();
        Thread.sleep(200);
        dealsPageObject.navigateToPageFour();
        dealsPageObject.clickOnItem();
        dealsPageObject.clickOnAddToCartBtn();

    }
}
