package Utility;

import BaseClass.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class UtilityClass extends BaseClass {

    public static int IMPLICIT_WAIT = 3000;
    public static int PAGELOAD_TIMEOUT = 3000;

    public static void screenShotOnFailedTestCase(String methodName){
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("C:\\Users\\19174\\Desktop\\PreParation\\IntelliJProjects\\Assignment_IBM\\FailedTestCasesScreenshots\\repo"+methodName+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
