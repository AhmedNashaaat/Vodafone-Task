package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id='routeSlider']/div/a[2]")
    WebElement nextBtn;
    @FindBy(id = "txtJourneyDate")
    WebElement startDataBtn;
    @FindBy(id = "txtReturnJourneyDate")
    WebElement returnDataBtn;
    @FindBy(xpath = "//*[@id='routeSlider']/div/div[2]/div/div/ul/li[1]/a")
    WebElement selectFromTo;
    @FindBy(xpath = "//a[contains(text(),'29')]")
    WebElement startData;
    @FindBy(xpath = "//a[contains(text(),'31')]")
    WebElement returnData;
    @FindBy(xpath = "//body/main[1]/form[1]/div[1]/div[1]/div[2]/div[3]/button[1]")
    WebElement searchBtn;



    public void setPlaceTxt() {
       clickBtn(nextBtn);
       clickBtn(selectFromTo);
    }
    public void setFromData() {
        clickBtn(startDataBtn);
        clickBtn(startData);
    }
//    public void setLeaveData()
//    {
//        clickBtn(returnDataBtn);
//        clickBtn(returnData);
//    }
    public void searchForBus()
    {
        clickBtn(searchBtn);
    }
}
