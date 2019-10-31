package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BodyPage extends BasePage {

    private BodyPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[@class='back-to-top-button-product-view']")
    WebElement upButtton;


    public void clickOnUpButton() {
        upButtton.isEnabled();
        upButtton.isDisplayed();
        upButtton.click();
    }




    @FindBy (xpath = "//*[@id=\"categories\"]/ul/li[3]/a")
    WebElement recentlySearchedButton;


    public void clickOnRecentlySearchedButton(){

            recentlySearchedButton.isEnabled();
            recentlySearchedButton.isDisplayed();
            recentlySearchedButton.click();

    }
}
