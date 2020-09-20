//Author: Muhammad Bilal Khawar
//Assignment: For IBM Interview

package BaseClass;

import Utility.UtilityClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public static Properties propt;
  //  public static WebEventListener eventListener;
    public static EventFiringWebDriver dr;

    public BaseClass() {
        propt = new Properties();
        try {
            FileInputStream ipa = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Files\\config.properties");
            propt.load(ipa);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void LaunchBrowser(){

        String browserName = propt.getProperty("browser");
        if(browserName.equalsIgnoreCase("chrome"))
        {
            //System.setProperty("webdriver.chrome.driver", "\\src\\test\\WebDrivers\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\19174\\Desktop\\PreParation\\IntelliJProjects\\FreeCrm\\src\\test\\WebDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(UtilityClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(UtilityClass.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.get(propt.getProperty("url"));
    }
}