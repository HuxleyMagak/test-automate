package com.bank.utils;

import com.bank.factory.DriverFactory;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        ScreenshotUtil.capture(result.getName());
        saveScreenshot();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ScreenshotUtil.capture(result.getName());
        saveScreenshot();
    }

    @Attachment(value = "Test Screenshot", type = "image/png")
    public byte[] saveScreenshot() {
        return ((TakesScreenshot) DriverFactory.getDriver())
                .getScreenshotAs(OutputType.BYTES);
    }
}