package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();  //upcasting
        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        // driver.get("http://facebook.com");
        driver.get("http://chat.openAI.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        driver.switchTo().newWindow(WindowType.WINDOW);
        // driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://facebook.com");

        Thread.sleep(4000);


        //   driver.close();  //closes the current window only

        //  driver.quit(); //quit closes all the windows open by driver
    }
}
