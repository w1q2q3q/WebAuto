package appium.page;

import appium.until.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.HashMap;

public class Login {
      By name=By.id("login_et_account");
      By password =By.id("login_et_pwd");
      By login = By.id("activity_login_btn_doLogin");
      By Nextpoint =By.id("");

      public void logintest(){
          AppDriver.driver.findElement(name).sendKeys("13526425840");
          AppDriver.driver.findElement(password).sendKeys("12345678");
          HashMap keycode = new HashMap();
          keycode.put("keycode", 111);
//          ((JavascriptExecutor)AppDriver.driver).executeScript("mobile: keyevent", keycode);
          AppDriver.driver.findElement(login).click();
      }

}
