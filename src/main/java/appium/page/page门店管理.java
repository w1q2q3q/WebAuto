package appium.page;

import appium.until.AppDriver;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class page门店管理 {

     By mengname = By.id("shop_name");

     public List<String> mengdianGettext(){
         return  AppDriver.driver.findElements(mengname) .stream()
                 .map(e->e.getText())
                 .collect(Collectors.toList());
     }

     public mendian详情 click(){
         AppDriver.driver.findElements(mengname).get(0).click();
         return new mendian详情();
     }






}
