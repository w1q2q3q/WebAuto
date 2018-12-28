package appium.page;

import appium.until.AppDriver;
import org.openqa.selenium.By;

public class mendianx {
       By xiugai= By.id("mIvTopBarRightTextAction");
       By shuju =By.id("value_tv");
       By shujuAssert=By.id("value_tv");
       By baocun=By.id("mIvTopBarRightTextAction");

       public String xiugai(){
           AppDriver.driver.findElement(xiugai).click();
           AppDriver.driver.findElements(shuju).get(0).clear();
           AppDriver.driver.findElements(shuju).get(0).sendKeys("12345");
           AppDriver.driver.findElement(baocun).click();
           new pagemg().click();
           System.out.println(AppDriver.driver.findElements(shujuAssert).get(0).getText());
           return AppDriver.driver.findElements(shujuAssert).get(0).getText();
//           Assert.assertEquals(AppDriver.driver.findElements(shujuAssert).get(0).getText(),"cs");
       }



}
