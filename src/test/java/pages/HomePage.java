package pages;
// construktor pole metoda kolejnosc elem w tescie)
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

    // zrob z tego stała private String url a potem properties;
    public static HomePage newObject(WebDriver driver){
        return new HomePage( driver);
    }
    HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//p[@class='v-action-close-rodo-popup btn btn-default rodo-button']")
    WebElement rodoButton;


    public void clickOnRodoButton() {
        rodoButton.isEnabled();
        rodoButton.isDisplayed();
        rodoButton.click();

    }

}








