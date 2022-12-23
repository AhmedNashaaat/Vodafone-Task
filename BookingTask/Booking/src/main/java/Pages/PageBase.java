package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver driver;

    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    protected static void clickBtn(WebElement Button)
    {
        Button.click();
    }
    protected static void setTextElementText(WebElement textElement,String value)
    {
        textElement.sendKeys(value);
    }


}
