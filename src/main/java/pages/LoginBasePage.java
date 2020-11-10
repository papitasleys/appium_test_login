package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginBasePage {
    protected AppiumDriver<MobileElement> driver;

    public LoginBasePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }
}
