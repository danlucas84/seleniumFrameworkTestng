package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public static LoginPage newPage(WebDriver driver) {
        return new LoginPage(driver);
    }

    LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "")
    WebElement popUpLoginButton;

    public void clickOnpopUpLoginButton() {
        popUpLoginButton.isEnabled();
        popUpLoginButton.isDisplayed();
        popUpLoginButton.click();
    }

    @FindBy(xpath = "")
    WebElement emailField;

    public void inputOnEmailField() {
        emailField.isEnabled();
        emailField.isDisplayed();
        emailField.sendKeys();
    }

    @FindBy(xpath = "")
    WebElement passwordField;

    public void inputOnpasswordField() {
        passwordField.isEnabled();
        passwordField.isDisplayed();
        passwordField.sendKeys();
    }

    @FindBy(xpath = "")
    WebElement loginButton;

    public void clickOnLoginButton() {
        loginButton.isEnabled();
        loginButton.isDisplayed();
        loginButton.click();
    }


}
