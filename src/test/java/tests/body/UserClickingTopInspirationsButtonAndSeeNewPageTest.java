package tests.body;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.BaseTest;
import utils.ConfigFileReader;

import static org.assertj.core.api.Assertions.assertThat;

public class UserClickingTopInspirationsButtonAndSeeNewPageTest extends BaseTest {

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

    @Step
    @Test
    public void UserclickOnRodoButton() {

        homePage.clickOnRodoButton();
    }

    @Step
    @Test
    public void UserShouldSeeLandingPageContainingTitle() {

        assertThat(driver.getTitle()).containsIgnoringCase("Vendoria.pl");

    }


}
