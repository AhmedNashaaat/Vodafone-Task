package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusesPage extends PageBase{
    public BusesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//body[1]/main[1]/form[1]/section[1]/div[1]/div[6]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[4]")
    WebElement selectSeatsBtn;
    @FindBy(xpath = "//span[normalize-space()='42']")
    WebElement boardingPointBtn;
    @FindBy(xpath = "//a[@id='Forwarddroping-tab']")
    WebElement droppingBtn;
    @FindBy(id = "Forward-1467543003073")
    WebElement clickOnDropping;
    @FindBy(id = "mobileNo")
    WebElement mobileTxt;
    @FindBy(id="email")
    WebElement emailTxt;
    @FindBy(xpath = "//a[contains(text(),'Passenger Details')]")
    WebElement personalDataBtn;
    @FindBy(id = "passengerNameForward0")
    WebElement passengerName;
    @FindBy(id = "genderCodeIdForward0")
    WebElement genderBtn;
    @FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/select[1]/option[2]")
    WebElement maleGender;
    @FindBy(id = "passengerAgeForward0")
    WebElement passengerAge;
    @FindBy(id = "concessionIdsForward0")
    WebElement concessionBtn;
    @FindBy(xpath = "(//option[@value='1466060086837'][normalize-space()='GENERAL PUBLIC'])[1]")
    WebElement concessionValue;
    @FindBy(id="cardNumberForward0")
    WebElement passengerId;
    @FindBy(id="PgBtn")
    WebElement createPayment;

    public void clickSeatBtn()
    {
        clickBtn(selectSeatsBtn);
    }
    public void selectBoardPoint(){
        clickBtn(boardingPointBtn);
    }
    public void selectDroppingPoint(){
        clickBtn(droppingBtn);
        clickBtn(clickOnDropping);
    }
    public void setCustomerData(String number,String mail)
    {
        setTextElementText(mobileTxt,number);
        setTextElementText(emailTxt,mail);
    }
    public void setPersonalData(String name,String age,String id){
        clickBtn(personalDataBtn);
        setTextElementText(passengerName,name);
        clickBtn(genderBtn);
        clickBtn(maleGender);
        setTextElementText(passengerAge,age);
        clickBtn(concessionBtn);
        clickBtn(concessionValue);
        setTextElementText(passengerId,id);
        clickBtn(createPayment);
    }

}
