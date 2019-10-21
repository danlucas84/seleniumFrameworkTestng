package tests;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.HomePage;
import utils.ConfigFileReader;

import static org.assertj.core.api.Assertions.assertThat;

public class UserClickingShowFavoritesButtonAndSeeNewPageTest {

    private WebDriver driver;
    private String url = "htps://vendoria.pl";

    HeaderPage headerPage;

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
    public void navigateToShopUrl() {

        driver.get(url);
    }


    @Step
    @Test
    public void clickOnRodoButton() {

        headerPage.newObject(driver)
                .clickOnshowfavoritesButton();
    }
    @Step
    @Test
    public void UserShouldSeeLandingPage(){

        String expectedUrl = "https//:vendoria.pl";
        assertThat(driver.getCurrentUrl().equalsIgnoreCase(expectedUrl));
}


