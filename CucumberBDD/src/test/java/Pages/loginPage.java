package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private final WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;
        if (!driver.getTitle().equals("Swag Labs")) {
            throw new IllegalStateException("This is not the login page. The current page is: " + driver.getCurrentUrl());
        }
    }

    public void enterUsername (String username) {
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
    }

    public void enterPassword (String password) {
        driver.findElement (By.xpath("//*[@id=\"password\"]")).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement (By.xpath("//*[@id=\"login-button\"]")).click();
    }

    public boolean checkLogOutIsDisplayed() {
        return driver.findElement (By.xpath("//*[@id=\"logout_sidebar_link\"]")).isDisplayed();
    }

    public void loginValidUser(String username, String password) {
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
        driver.findElement (By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        driver.findElement (By.xpath("//*[@id=\"login-button\"]")).click();
    }

}

