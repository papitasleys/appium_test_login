package usersteps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.HomePageObject;

public class HomeUserSteps {
    private HomePageObject homePageObject;

    public HomeUserSteps(AppiumDriver<MobileElement> driver) {
        this.homePageObject = new HomePageObject(driver);
    }

    public String readGreeting(){
        return homePageObject.readGreeting();
    }
}
