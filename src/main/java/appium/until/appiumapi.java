package appium.until;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class appiumapi {

    public void jietu(AndroidDriver driver) throws IOException {
        FileUtils.copyFile(
                driver.getScreenshotAs(OutputType.FILE).getCanonicalFile(),
                new File(1+".png"));
        System.out.println("截图");
    }
}
