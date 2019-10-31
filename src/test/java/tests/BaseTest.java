package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;


public class BaseTest {


    private ChromeDriver driver;

    @BeforeClass

        public void setup() {
            //Create a Chrome driver. All test classes use this.
            driver = new ChromeDriver();

            //Maximize Window
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.manage().deleteAllCookies();


        }

        @AfterClass
        public void teardown () {
            driver.quit();
        }
    }

