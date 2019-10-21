package tests.body;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BodyPage;
import pages.FooterPage;
import pages.HomePage;
import utils.ConfigFileReader;

import static org.assertj.core.api.Assertions.assertThat;

public class UserClickingUpButtonInBodySectionAndMoveUpTest {

    private WebDriver driver;
    BodyPage bodyPage;
    HomePage homePage;
    FooterPage footerPage;
    JavascriptExecutor jse = (JavascriptExecutor) null;


    @Step
    @BeforeMethod
    public void ConfigFileReading() {
        ConfigFileReader configFileReader = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
        driver = new ChromeDriver();
        //System.getProperty(configFileReader.getApplicationUrl());
    }


    @Step
    public void UserclickOnRodoButton() {


        homePage.clickOnRodoButton();
    }

    @Step
    public void UserShouldSeeLandingPageContainingTitle() {

        assertThat(driver.getTitle()).containsIgnoringCase("Vendoria.pl");

    }

    @Step
    @Test

    public void UserScrollDown() {

        jse.executeScript("window.scrollBy(0,250)");
    }

    @Step
    @Test
    public void UserClickingUpButton() {
        bodyPage.clickOnUpButton();
    }

    @Step
    @Test
    public void UserIsBackAfterClickingUpButton() {

    }
    @Step
    @Test
    public void UserAgainScrollDown() {

        jse.executeScript("window.scrollBy(0,250)");
    }

    @Step
    @Test
    public void clickingOnRulesButton() {

        footerPage.clickOnRulesButton();
    }

    @Step
    @Test

    public void UserShouldSeeRulesPage(){

        String expectedUrl = "https://vendoria.pl/rules";
        assertThat((driver.getCurrentUrl()).equalsIgnoreCase(expectedUrl));
    }

    @Step
    @AfterMethod

    public void ClosingDriver() {
        driver.close();
        driver.quit();

    }


}

