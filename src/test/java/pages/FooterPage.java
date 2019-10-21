package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage extends BasePage {

    private FooterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath= " //a[contains(text(),'Regulamin')]")
    WebElement rulesButton;



    public void clickOnRulesButton() {

        rulesButton.isEnabled();
        rulesButton.isDisplayed();
        rulesButton.click();
    }


}
