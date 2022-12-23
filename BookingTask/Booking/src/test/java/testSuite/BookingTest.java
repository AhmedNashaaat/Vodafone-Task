package testSuite;

import Pages.BusesPage;
import Pages.HomePage;
import data.LoadProperties;
import org.testng.annotations.Test;

public class BookingTest extends TestBase {
    HomePage homePageObject;


    BusesPage busesPageObject;
    String customerMobile=LoadProperties.userdata.getProperty("customerMobile");
    String customerEmail=LoadProperties.userdata.getProperty("customerEmail");
    String passengerName=LoadProperties.userdata.getProperty("passengerName");
    String passengerAge=LoadProperties.userdata.getProperty("passengerAge");
    String passengerId=LoadProperties.userdata.getProperty("passengerId");

    @Test
    public void UserCanBooking() throws InterruptedException {
        homePageObject = new HomePage(driver);
        homePageObject.setPlaceTxt();
        homePageObject.setFromData();
        homePageObject.searchForBus();
        busesPageObject = new BusesPage(driver);
        Thread.sleep(300);
        busesPageObject.clickSeatBtn();
        busesPageObject.selectBoardPoint();
        busesPageObject.selectDroppingPoint();
        busesPageObject.setCustomerData(customerMobile,customerEmail);
        busesPageObject.setPersonalData(passengerName,passengerAge,passengerId);
    }
}
