package appium.testcase;

import appium.page.Login;
import appium.page.pagemg;
import appium.page.pages;
import appium.until.AppDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test1 {

    @BeforeClass
    public void login() throws MalformedURLException, InterruptedException {
        AppDriver.login();
       // new Login().logintest();
    }
    @Test
    public void homepage(){
//        System.out.println(
//                new pages().mendian().mengdianGettext().get(0));
////        new pagemg().click().xiugai();

    }
    @AfterClass
    public void Appquit(){
       AppDriver.quit();
    }
}
