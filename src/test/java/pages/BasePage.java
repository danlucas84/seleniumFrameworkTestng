package pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BasePage {

    protected final WebDriver driver;
    BasePage(WebDriver driver){

        this.driver = driver;

    }



    public class BaseTest {
// usunac
        @BeforeMethod
        public void BeforeMethod(){
            System.out.println("I am in Before Method! Test is starting!");
        }

        @AfterMethod
        public void AfterMethod(){
            System.out.println("I am in After Method! Test is ending!");

        }
    }
}
