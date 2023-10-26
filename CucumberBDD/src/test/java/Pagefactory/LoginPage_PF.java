package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

    @FindBy(id ="user-name")
            @CacheLookup
    WebElement txt_username;
    @FindBy(id ="password")
    WebElement txt_password;
    @FindBy(id ="login-button")
    WebElement btn_login;
//    @FindBy(partialLinkText = "Rick")
//    List<WebElement> mylinks;

    @FindBy(how = How.ID,using = "name")
    WebElement abc;

    WebElement driver;
    WebElement btn_logout;
    public LoginPage_PF(WebDriver driver){
        this.driver= (WebElement) driver;
        PageFactory.initElements(driver,this);
//        AjaxElementLocator factory =new AjaxElementLocator(driver, 30);
//    PageFactory.initElements(new AjaxElementLocator(driver,30),this);
    }


    public void enterUsername(String username){
        txt_username.sendKeys(username);
    }
    public void  enterPassword(String password){
        txt_password.sendKeys(password);
    }

    public void clickLogin() {
        btn_login.click();
    }

    public boolean checkLogOutIsDisplayed() {
        return btn_logout.isDisplayed();
    }
}
