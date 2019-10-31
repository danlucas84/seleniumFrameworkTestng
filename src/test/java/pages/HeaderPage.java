package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends BasePage {

    public static HeaderPage newObject(WebDriver driver){
        return new HeaderPage(driver);
    }

    private HeaderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//span[@class='fa fa-shopping-bag fa-2x']")
    WebElement myOrdersButton;

    /**
     * Click button to show user orders
     * @return
     */
    public HeaderPage clickOnMyOrdersButton() {
        myOrdersButton.isEnabled();
        myOrdersButton.isDisplayed();
        myOrdersButton.click();
        return this;
    }



    @FindBy(xpath="//a[contains(@class,'feegle-action-login-popup')]")
    WebElement accountButton;

    /**
    * click button to go user accunt ( e.g to log in)
    * @return
    */
    public HeaderPage clickOnAccountButton() {
        accountButton.isEnabled();
        accountButton.isDisplayed();
        accountButton.click();
        return this;
    }

    @FindBy(xpath ="//*[@id=\"top-menu-bar\"]/div[3]//a[2]//span[1]")
    WebElement favouritesButton;

    /**
     * click button to go to favourites items
     * @return
     */

    public HeaderPage clickOnfavouritesButton() {

        favouritesButton.isEnabled();
        favouritesButton.isDisplayed();
        favouritesButton.click();
        return this;



    }
}



