package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class HomePageObject extends LoginBasePage {
    /* Locate Elements */
    private MobileElement greetingTxt = driver.findElement(By.id("io.grainchain.logintest:id/textview_first"));

    public HomePageObject(AppiumDriver<MobileElement> driver){
        super(driver);
    }

    public String readGreeting(){
        return greetingTxt.getText();
    }
}
