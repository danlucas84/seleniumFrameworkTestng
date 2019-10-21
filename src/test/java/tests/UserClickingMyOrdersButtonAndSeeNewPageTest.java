package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.ConfigFileReader;

import static org.assertj.core.api.Assertions.assertThat;

@Epic("automation test")

@Feature("Positive navigating feature tests")

public class UserClickingMyOrdersButtonAndSeeNewPageTest {

    private WebDriver driver;

    private String url = "https://vendoria.pl";

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

    public void navigateToShopUrl(){

        driver.get(url);
    }

    @Step
    @Test
    public void clickOnRodoButton() {
        HomePage.newObject(driver)
                .clickOnRodoButton();
    }
    @Step
    @Test
    public void UserShouldSeeLandingPage(){

        String expectedUrl = "https//:vendoria.pl";
        assertThat(driver.getCurrentUrl().equalsIgnoreCase(expectedUrl));


    }
//    @Step
//    @Test
//    public void userClickingMyOrdersButton(){
//        HeaderPage.newObject(driver)
//                .clickOnMyOrdersButton()
//                .cliokcośtsm();

    //}
    @Step
    @Test
    public void UserShouldSeeMyOrdersPage (){
        String expectedUrl ="https://vendoria.pl/myorders";
        assertThat(driver.getCurrentUrl().equalsIgnoreCase(expectedUrl));


    }
    @Step
    @AfterMethod

    public void ClosingDriver() {
        driver.close();
        driver.quit();

    }


}
