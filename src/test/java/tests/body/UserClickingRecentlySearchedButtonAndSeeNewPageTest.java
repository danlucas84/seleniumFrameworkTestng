package tests.body;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BodyPage;
import pages.HomePage;
import tests.BaseTest;
import utils.ConfigFileReader;

import static org.assertj.core.api.Assertions.assertThat;

public class UserClickingRecentlySearchedButtonAndSeeNewPageTest extends BaseTest {

    private WebDriver driver;
    private String url = "htps://vendoria.pl";

    HomePage homePage;
    BodyPage bodyPage;

    @Step
    @BeforeMethod
    public void ConfigReading() {

        ConfigFileReader configFileReader = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
        driver = new ChromeDriver();
        System.getProperty(configFileReader.getApplicationUrl());
    }


    @Step
    @Test
    public void navigateToShopUrl() {


        driver.get(url);


}

    @Step
    @Test
    public void UserClickOnRodoButton(){

        homePage.newPage(driver)
                .clickOnRodoButton();
    }

    @Step
    @Test
    public void UserClickingRecentlyResearchedButton(){

        bodyPage.newPage(driver)
                .clickOnRecentlySearchedButton();
    }

    @Step
    @Test
    public void UserShouldSeePageWithGetInspiredInformation(){

        String expectedUrl = "https://vendoria.pll/inspiracje/1";
        assertThat((driver.getCurrentUrl()).equalsIgnoreCase(expectedUrl));
    }

    @Step
    @AfterMethod
    public void ClosingDriver() {
        driver.close();
        driver.quit();

    }
}
