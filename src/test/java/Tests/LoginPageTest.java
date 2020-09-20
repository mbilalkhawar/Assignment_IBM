package Tests;

import BaseClass.BaseClass;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
    LoginPage lpg;

    @BeforeTest
    public void launchBrowser(){
        LaunchBrowser();
        lpg = new LoginPage();
    }

    @Test(priority = 1)
    public void testCurrentTitleOfThePage(){
        Assert.assertEquals("Free CRM software helps any business large or small", lpg.titleOfThePage());
    }

    @Test(priority = 2)
    public void navigateToSignInPage(){
        lpg.clickOnLogin();
    }

    @Test(priority = 3)
    public void loginToHomePage(){
        lpg.enterEmail(propt.getProperty("username"));
        lpg.enterPassword(propt.getProperty("password"));
        lpg.clickOnLoginButton();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
