package ScreenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotDemo {

    @Test
    public void myTest() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com/");

       String timeStamp =  new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
       String fileName = "img"+timeStamp+".png";

        //1. create object reference of TakeScreenShot
        //   assign driver to it and type-cast it to TakeScreenShot
        TakesScreenshot ts = (TakesScreenshot) driver;

        //2. call the method getScreenshotAs using ts
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        //3. copy this file object into a real image file
        FileUtils.copyFile(srcFile, new File("D:\\Screenshots\\"+fileName));
    }

    @Test
    public void myTest1() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amolujagare.in/");

        //1. create object reference of TakeScreenShot
        //   assign driver to it and type-cast it to TakeScreenShot
        TakesScreenshot ts = (TakesScreenshot) driver;

        //2. call the method getScreenshotAs using ts
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        //3. copy this file object into a real image file
        FileUtils.copyFile(srcFile, new File("D:\\Screenshots\\img.png"));
    }
}
