package com.bank.tests;

import com.bank.factory.DriverFactory;
import com.bank.pages.LoginPage;
import com.bank.utils.ConfigReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    @BeforeMethod
    public void setUp() {
        DriverFactory.initDriver();
        DriverFactory.getDriver().get(ConfigReader.get("base.url"));
    }

    @Test
    public void verifyLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("huxley", "magak");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
