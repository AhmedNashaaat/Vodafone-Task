package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class resultsPage extends PageBase {
    public resultsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(partialLinkText = "Cleaning")
    WebElement itemSelected;

    public void clickOnItem()
    {
        clickBtn(itemSelected);
    }
}
