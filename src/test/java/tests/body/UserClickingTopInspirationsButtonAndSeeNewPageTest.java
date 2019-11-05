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

        //dodac assercje na kod błedu w kazdej metodzie

        // assercja taka powinna byc w utils

        // jak wywołac kod błedu vendoria.pl/anvdf - zrobic losowy url przez uzycie fukcji random

        // napisac  testy ktore spradzaja obługe błedów i kody odpwiedzi

    }


}
