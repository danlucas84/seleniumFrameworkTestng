package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BodyPage extends BasePage {

    public static BodyPage newObject(WebDriver driver) {
        return new BodyPage(driver);
    }

    private BodyPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = "//*[@id=\"categories\"]/ul/li[3]/a")
    WebElement recentlySearchedButton;

    /**
     * click button to go to the page with recetly search items
     * @return
     */


    public BodyPage clickOnRecentlySearchedButton() {

        recentlySearchedButton.isEnabled();
        recentlySearchedButton.isDisplayed();
        recentlySearchedButton.click();
        return this;
    }


    @FindBy(xpath = "//a[@class='back-to-top-button-product-view']")
    WebElement upButtton;

    /**
     * click button to move up to the top of landing page
     *
     * @return
     */


    public BodyPage clickOnUpButton() {
        upButtton.isEnabled();
        upButtton.isDisplayed();
        upButtton.click();
        return this;

    }

}
