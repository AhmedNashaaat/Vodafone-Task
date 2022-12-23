package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchTxt;
    @FindBy(id = "nav-search-submit-button")
    WebElement submitBtn;
    @FindBy(css = "span.a-color-state.a-text-bold")
    public WebElement results;
    @FindBy(xpath = "//a[@href='/gp/goldbox?ref_=nav_cs_gb']")
    WebElement tDealsBtn;
    @FindBy(css = "input.a-button-input")
    WebElement dChangeBtn;

    public void search(String nameOfItem) {
        setTextElementText(searchTxt, nameOfItem);
        clickBtn(submitBtn);
    }

    public void openDeals() {
        clickBtn(dChangeBtn);
        clickBtn(tDealsBtn);
    }

}
