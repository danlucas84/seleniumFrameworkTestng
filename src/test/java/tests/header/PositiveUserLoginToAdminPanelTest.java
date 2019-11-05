package tests.header;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pages.HeaderPage;
import pages.HomePage;
import tests.BaseTest;
import utils.ConfigFileReader;

@Epic("Testy automatyczne")

@Feature(" Positive Login tests")

public class PositiveUserLoginToAdminPanelTest extends BaseTest {

    private WebDriver driver;
    HomePage homePage;
    HeaderPage headerPage;



    @Step
    @BeforeMethod
    public void ConfigFileReading() {
        ConfigFileReader configFileReader = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
        driver = new ChromeDriver();
        //System.getProperty(configFileReader.getApplicationUrl());
    }
}
