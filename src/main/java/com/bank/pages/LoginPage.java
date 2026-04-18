package com.bank.pages;

import com.bank.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By username = By.name("email");
    private By password = By.name("pass");
   // private By loginBtn = By.role("button");

    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
    //    driver.findElement(loginBtn).click();
    }
}