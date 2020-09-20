package Pages;

import BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='content card-header']//a//i[@class='right floated refresh icon color-gray']")
    WebElement contactActivityRefresh;

    @FindBy(xpath = "//div[@class='content']//a//i[@class='right floated refresh icon color-gray']")
    WebElement dealsRefresh;

    public void refreshContactActivity(){
        contactActivityRefresh.click();
    }

    public void deals(){
        dealsRefresh.click();
    }

    public String getTitleOfHomePage(){
        return driver.getTitle();
    }

}
