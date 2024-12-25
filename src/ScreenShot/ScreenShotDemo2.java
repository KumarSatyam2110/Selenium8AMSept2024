package ScreenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotDemo2 {

    @Test
    public void myTest() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com/");

        WebElement element = driver.findElement(By.xpath("//input[@name='pass']"));

        String timestamp = new SimpleDateFormat("_ddMMyyyy_hhmmss").format(new Date());
        String fileName = "img1"+timestamp+".png";

        File srcFile = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("D:\\Screenshots\\"+fileName));

    }
}
