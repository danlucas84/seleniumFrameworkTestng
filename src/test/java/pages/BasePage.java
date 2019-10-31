package pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected static WebDriver driver;

    BasePage(WebDriver driver) {

        this.driver = driver;

    }

}
