package usersteps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.HomePageObject;
import pages.LoginFormPageObject;

public class LoginFormUserSteps {
    private LoginFormPageObject loginFormPageObject;

    public LoginFormUserSteps(AppiumDriver<MobileElement> driver){
        this.loginFormPageObject = new LoginFormPageObject(driver);
    }

    public void enterCredentials(String email, String password){
        loginFormPageObject.enterEmail(email);
        loginFormPageObject.enterPassword(password);
        loginFormPageObject.tapOnLogin();
    }

    public void enterEmail(String email){
        loginFormPageObject.enterEmail(email);
    }

    public void enterPassword(String password){
        loginFormPageObject.enterPassword(password);
    }

    public boolean isLoginButtonEnabled(){
        return loginFormPageObject.isLoginButtonEnabled();
    }

}
