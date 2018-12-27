package appium.page;

import appium.until.AppDriver;
import org.openqa.selenium.By;

public class pages {
        By mendian=By.id("rl_manager_shop");

        public pagemg mendian(){
            AppDriver.driver.findElement(mendian).click();
            return new pagemg();
        }






}
