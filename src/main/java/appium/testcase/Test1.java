package appium.testcase;

import appium.page.Login;
import appium.page.page门店管理;
import appium.page.page首页;
import appium.until.AppDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

public class Test1 {

    @BeforeClass
    public void login() throws MalformedURLException, InterruptedException {
        AppDriver.login();
        new Login().logintest();
    }
    @Test
    public void homepage(){
        System.out.println(
                new page首页().mendian().mengdianGettext().get(0));
        new page门店管理().click().xiugai();

    }
    @AfterClass
    public void Appquit(){
       AppDriver.quit();
    }
}
