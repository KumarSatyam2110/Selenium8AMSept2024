package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        Thread.sleep(2000);

        //1st Method
        // driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("C:\\Users\\Kumar Satyam\\Desktop\\spring.jpeg");

        //2nd Method

        WebElement fileUpload = driver.findElement(By.xpath("/html/body/input[1]"));
        String path= "C:\\Users\\Kumar Satyam\\Desktop\\spring.jpeg";
        fileUpload.sendKeys(path);


    }
}
