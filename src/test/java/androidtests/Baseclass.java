package androidtests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import setup.AppiumSetup;

import java.util.concurrent.TimeUnit;

public class Baseclass {
    protected AppiumDriver<MobileElement> driver;

    @BeforeMethod
    public void initializeDriver() {
        driver = AppiumSetup.setupAppiumDriver();
        driver.manage().timeouts().implicitlyWait( 10 , TimeUnit.SECONDS );
    }


    @AfterMethod
    public void teardown() {
        driver.closeApp();
        driver.quit();
    }
}
