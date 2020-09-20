package Tests;

import BaseClass.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;
import org.apache.log4j.Priority;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    HomePage hmpg;
    LoginPage lpg;

    @BeforeTest
    public void launchingBrowser(){
        LaunchBrowser();
        lpg = new LoginPage();
        hmpg = new HomePage();
        lpg.clickOnLogin();
        lpg.enterEmail(propt.getProperty("username"));
        lpg.enterPassword(propt.getProperty("password"));
        lpg.clickOnLoginButton();
    }

    @Test(priority = 1)
    public void checkTitleOfHomePage(){
        Assert.assertEquals("Cogmento CRM",hmpg.getTitleOfHomePage());
    }

    @Test(priority = 2)
    public void refreshActivity(){
        hmpg.refreshContactActivity();
        hmpg.deals();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
