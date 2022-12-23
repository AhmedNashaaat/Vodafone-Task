package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class itemPage extends PageBase{
    public itemPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "add-to-cart-button")
    WebElement addItemToCartBtn;
    @FindBy(partialLinkText = "Go to Cart")
    WebElement goToCart;
    @FindBy(id = "sc-subtotal-label-buybox")
    public WebElement total;

    public void addToCart()
    {
        clickBtn(addItemToCartBtn);
    }
    public void checkCart()
    {
        clickBtn(goToCart);
    }

}
