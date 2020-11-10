package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginFormPageObject extends LoginBasePage {
    /* Locate Elements */
    private MobileElement emailTxtField = driver.findElement(By.id("io.grainchain.logintest:id/username"));
    private MobileElement passwordTxtField = driver.findElement(By.id("io.grainchain.logintest:id/password"));
    private MobileElement loginBtn = driver.findElement(By.id("io.grainchain.logintest:id/login"));

    public LoginFormPageObject(AppiumDriver<MobileElement> driver){
        super(driver);
    }

    /* interact with elements */
    public void enterEmail(String email){
        emailTxtField.clear();
        emailTxtField.sendKeys(email);
    }

    public void enterPassword(String password){
        passwordTxtField.clear();
        passwordTxtField.sendKeys(password);
    }

    public void tapOnLogin(){
        loginBtn.click();
    }

    public boolean isLoginButtonEnabled(){
        return loginBtn.isEnabled();
    }

}
