package Pages;

import BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//a[@class = 'btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
    //@FindBy(xpath = "//*[@id='navbar-collapse']/ul/li[1]")
    WebElement loginButton;

    @FindBy(xpath = "//input[@type = 'text']")
    WebElement emailField;

    @FindBy(xpath = "//input[@type = 'password']")
    WebElement passwordField;

    @FindBy(xpath = "//div[@class= 'ui fluid large blue submit button']")
    WebElement loginButtonOnSignInPage;


    public String titleOfThePage(){

        return driver.getTitle();
    }
    public void clickOnLogin(){

        /*Actions actions = new Actions(driver);
        actions.moveToElement(loginButton).click().perform();
        */
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("arguments[0].click();", loginButton);
        loginButton.click();
    }

    public void enterEmail(String email){
        emailField.sendKeys(email);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public HomePage clickOnLoginButton(){
        loginButtonOnSignInPage.click();
        return new HomePage();
    }
}
