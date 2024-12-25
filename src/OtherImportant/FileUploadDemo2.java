package OtherImportant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadDemo2 {

    @Test
    public void FileUD2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formstone.it/components/upload/demo/");

        WebElement fileup2= driver.findElement(By.cssSelector(".fs-upload-input"));

        String filePath = "D:\\photo\\hd.jpeg";
        Thread.sleep(3000);
        fileup2.sendKeys(filePath);
    }
}
