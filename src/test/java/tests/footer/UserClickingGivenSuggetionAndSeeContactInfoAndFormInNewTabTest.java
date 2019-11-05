package tests.footer;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pages.FooterPage;
import pages.HomePage;
import tests.BaseTest;
import utils.ConfigFileReader;

public class UserClickingGivenSuggetionAndSeeContactInfoAndFormInNewTabTest extends BaseTest {


    private WebDriver driver;
    HomePage homePage;
    FooterPage footerPage;



    @Step
    @BeforeMethod
    public void ConfigFileReading() {
        ConfigFileReader configFileReader = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
        driver = new ChromeDriver();
        //System.getProperty(configFileReader.getApplicationUrl());
    }

}
