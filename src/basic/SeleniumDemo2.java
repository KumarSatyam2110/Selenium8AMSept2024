package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();  //upcasting
        ;

        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        //driver.get("http://gmail.com");

        driver.navigate().to("http://gmail.com");

        Thread.sleep(4000);
        driver.navigate().back();

        Thread.sleep(2000);
        driver.navigate().forward();

        Thread.sleep(2000);
        driver.navigate().refresh();


    }
}
