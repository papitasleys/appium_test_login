package androidtests;

import org.testng.Assert;
import org.testng.annotations.Test;
import usersteps.HomeUserSteps;
import usersteps.LoginFormUserSteps;

public class LoginTests extends Baseclass {
    LoginFormUserSteps loginFormUserSteps;
    HomeUserSteps homeUserSteps;

    @Test
    public void loginValidCredentials(){
        loginFormUserSteps = new LoginFormUserSteps(driver);

        //enter valid credentials
        loginFormUserSteps.enterCredentials("clever@user.com", "123456");

        homeUserSteps = new HomeUserSteps(driver);
        String greeting = homeUserSteps.readGreeting();

        //validate that user entered is in the greeting text message
        Assert.assertTrue(greeting.contains("clever@user.com"),"greeting doesn't contains username");
        System.out.println(greeting);
    }

    @Test
    public void validateLoginButton(){
        loginFormUserSteps = new LoginFormUserSteps(driver);

        //button should be disabled by default
        Assert.assertFalse(loginFormUserSteps.isLoginButtonEnabled(), "button is enabled");

        loginFormUserSteps.enterEmail("other@user.com");
        loginFormUserSteps.enterPassword("12345");

        //button should be still disabled with a short password
        Assert.assertFalse(loginFormUserSteps.isLoginButtonEnabled(), "button is enabled");

        loginFormUserSteps.enterPassword("123456");


        //button should be still enabled with a >5 long password
        Assert.assertTrue(loginFormUserSteps.isLoginButtonEnabled(), "button is disabled");
    }

}
