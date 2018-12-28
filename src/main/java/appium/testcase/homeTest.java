package appium.testcase;

import appium.dao.TestFailListener;
import appium.page.Login;
import appium.page.pagemg;
import appium.page.pages;
import appium.until.AppDriver;
import appium.until.appiumapi;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
@Listeners({TestFailListener.class})
public class homeTest {

    @BeforeClass
    public void login() throws MalformedURLException, InterruptedException {
        AppDriver.login();
        new Login().logintest();
    }
    @Test(description = "主页测试")
    public void homepage() throws IOException {
        System.out.println(
                new pages().mendian().mengdianGettext().get(0));
        String shujuAssert =new pagemg().click().xiugai();
        FileUtils.copyFile(
                AppDriver.driver.getScreenshotAs(OutputType.FILE).getCanonicalFile(),
                new File("I:/1.png"));
        Assert.assertEquals(shujuAssert,"vd宿舍");


    }
    @AfterClass
    public void Appquit(){
       AppDriver.quit();
    }
}
