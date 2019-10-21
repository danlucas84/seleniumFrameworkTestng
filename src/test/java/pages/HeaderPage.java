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

    public HeaderPage cliokcośtsm() {
        myOrdersButton.click();
        return this;

        // a nie  getheederpage jak w tutorialu
// header page new header page

        //headerpage.akcja1
        //.akcja2
        //chainowanie aby pokazac  łacuch akcji usera
// metody
    }

    @FindBy(xpath="")
    WebElement accountButton;

    public HeaderPage clickOnAccountButton() {
        accountButton.isEnabled();
        accountButton.isDisplayed();
        accountButton.click();
        return this;
    }

    public void clickOnshowfavoritesButton() {
    }
}



