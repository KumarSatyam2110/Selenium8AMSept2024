package OtherImportant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {

    @Test
    public void fileUpload() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        WebElement fileWb = driver.findElement(By.xpath("//input[@value='browse here']"));

        //get the path of file which is to be uploaded

        String filePath = "D:\\photo\\hd.jpeg";
        Thread.sleep(3000);
        fileWb.sendKeys(filePath);



    }
}
