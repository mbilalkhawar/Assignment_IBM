package dockerSeleniumGrid;

import BaseClass.BaseClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class parallelTesting extends BaseClass {

    @Test
    public void triggeringChromeBrowser() throws MalformedURLException, InterruptedException {
        DesiredCapabilities sc = DesiredCapabilities.chrome();
        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver drr = new RemoteWebDriver(url, sc);
        drr.get(propt.getProperty("url"));
        drr.getTitle();
        Thread.sleep(3000);
        System.out.println("Title of the Page: "+drr.getTitle());
        drr.quit();
    }

    @Test
    public void triggeringFireFoxBrowser() throws MalformedURLException, InterruptedException {
        DesiredCapabilities sc = DesiredCapabilities.firefox();
        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver drr = new RemoteWebDriver(url, sc);
        drr.get(propt.getProperty("url"));
        drr.getTitle();
        Thread.sleep(3000);
        System.out.println("Title of the Page: "+drr.getTitle());
        drr.quit();
    }
}
