package tests.body;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import tests.BaseTest;
import utils.ConfigFileReader;

//camel case // pascal case
public class UserClickingInspirationForGiftsButtonAndSeeNewPageTest extends BaseTest {

    private WebDriver driver;
    HomePage homePage;



    @Step
    @BeforeMethod
    public void ConfigFileReading() {
        ConfigFileReader configFileReader = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
        driver = new ChromeDriver();
        //System.getProperty(configFileReader.getApplicationUrl());
    }


}
