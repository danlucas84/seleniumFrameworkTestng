package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CurrentPage extends BasePage {
    public static  CurrentPage newObject(WebDriver driver) {
        return new CurrentPage(driver);
    }

    private CurrentPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


}
