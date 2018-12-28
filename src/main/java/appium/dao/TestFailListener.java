package appium.dao;

import appium.until.AppDriver;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;

public class TestFailListener extends TestListenerAdapter {


    public void onTestFailure(ITestResult result) {
        takePhoto();
    }

    @Attachment(value = "screen shot",type = "image/png")
    public byte[]  takePhoto(){
        byte[] screenshotAs = AppDriver.driver.getScreenshotAs(OutputType.BYTES);
        System.out.println("截图11");
        return screenshotAs;
    }

}
