package tests.body;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BodyPage;
import pages.HomePage;
import utils.ConfigFileReader;

import static org.assertj.core.api.Assertions.assertThat;

public class UserClickingRecentlySearchedAndSeeNewPageTest {

    private WebDriver driver;
    HomePage homePage;
    BodyPage bodyPage;

    @Step
    @BeforeMethod

    public void ConfigReading(){

        ConfigFileReader configFileReader = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
        driver = new ChromeDriver();

        //System.getProperty(configFileReader.getApplicationUrl());


    }

    @Step
    public void UserClickOnRodoButton(){

        homePage.clickOnRodoButton();
    }

    @Step

    public void UserClickingRecentlyResearchedButton(){

        bodyPage.clickOnRecentlySearchedButton();
    }

    @Step

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
