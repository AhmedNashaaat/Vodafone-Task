package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DealsPage extends PageBase {
    public DealsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[normalize-space()='Headphones']")
    WebElement headPhones;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[21]/div[1]/div[1]/div[1]/div[2]/div[2]/span[3]/ul[1]/li[18]/label[1]/span[1]")
    WebElement grocery;
    @FindBy(xpath = "//span[normalize-space()='10% off or more']")
    WebElement discountBtn;
    @FindBy(xpath = "(//a[normalize-space()='3'])[1]")
    WebElement page3Btn;
    @FindBy(xpath = "(//a[normalize-space()='4'])[1]")
    WebElement page4Btn;
    @FindBy(xpath = "//div[contains(text(),'Sony Wireless RF Headphone 150-Foot Range, Noise R')]")
    WebElement itemBtn;
    @FindBy(id = "add-to-cart-button")
    WebElement addToCartBtn;


    public void selectGroceryAndHeadphones() {
        clickBtn(grocery);
        clickBtn(headPhones);


    }

    public void clickOnDiscount() {
        clickBtn(discountBtn);
    }

    public void navigateToPageThree(){
        clickBtn(page3Btn);
    }
    public void navigateToPageFour()  {
        clickBtn(page4Btn);
    }

    public void clickOnItem() {
        clickBtn(itemBtn);
    }

    public void clickOnAddToCartBtn() {
        clickBtn(addToCartBtn);
    }
}
