package tests.body;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CurrentPage;
import pages.HomePage;
import utils.ConfigFileReader;

import static org.assertj.core.api.Assertions.assertThat;

@Epic("automation tests")

@Feature(" Positive navigating feature tests")

public class UserClickingRodoButtonTest {

    private WebDriver driver;
    HomePage homePage;
    CurrentPage currentPage;


    @Step
    @BeforeMethod
    public void ConfigFileReading() {
        ConfigFileReader configFileReader = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
        driver = new ChromeDriver();
        //System.getProperty(configFileReader.getApplicationUrl());
    }

//    @Step
//    @Test
//    public static void UserNavigateToShopLandingPage() {
//
//        homePage.open();


    @Step
    public void clickOnRodoButton() {

        homePage.clickOnRodoButton();
    }
    @Step
    public void UserShouldSeeLandingPage(){

        String expectedUrl = "https://vendoria.pl";
        assertThat(driver.getCurrentUrl().equalsIgnoreCase(expectedUrl));

    }
    @Step
    @AfterMethod

    public void ClosingDriver() {
        driver.close();
        driver.quit();

    }


}


