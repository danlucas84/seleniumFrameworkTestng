package tests.header;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.HomePage;
import utils.ConfigFileReader;

import static org.assertj.core.api.Assertions.assertThat;

@Epic("automation tests")

@Feature(" Positive navigating feature tests")

public class UserClickingFavouritesButtonAndSeeNewPageTest {

    private WebDriver driver;
    private String url = "htps://vendoria.pl";

    HeaderPage headerPage;
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
    public void navigateToShopUrl() {

        driver.get(url);
    }


    @Step
    @Test
    public void clickOnRodoButton() {



        homePage.newPage(driver)
                .clickOnRodoButton();
    }

    @Step
    @Test
    public void clickOnfavouritesButton(){
        headerPage.newObject(driver)
                .clickOnfavouritesButton();
    }


    @Step
    @Test
    public void UserShouldSeePageWithPromotedFavouritesItems() {

        String expectedUrl = "https://vendoria.pl/showfavourites";
        assertThat(driver.getCurrentUrl().equalsIgnoreCase(expectedUrl));
    }
}


