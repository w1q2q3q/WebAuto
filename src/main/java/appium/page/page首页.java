package appium.page;

import appium.until.AppDriver;
import org.openqa.selenium.By;

public class page首页 {
        By mendian=By.id("rl_manager_shop");

        public page门店管理 mendian(){
            AppDriver.driver.findElement(mendian).click();
            return new page门店管理();
        }






}
