package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork_DrpDown1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blazedemo.com/");

        Thread.sleep(3000);

        WebElement drpDown1 = driver.findElement(By.name("fromPort"));
        Select underDrpDown1 = new Select(drpDown1);
        underDrpDown1.selectByIndex(3);

        Thread.sleep(3000);

        WebElement drpdown2 = driver.findElement(By.name("toPort"));
        Select underDrpDown2 = new Select(drpdown2);
        underDrpDown2.selectByValue("Berlin");

        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
    }
}
