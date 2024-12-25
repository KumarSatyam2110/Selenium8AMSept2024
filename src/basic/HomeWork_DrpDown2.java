package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork_DrpDown2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lifepartner.in/");

        WebElement drpDowm1 = driver.findElement(By.id("sel3"));
        Select underDrpDown1 = new Select(drpDowm1);
        underDrpDown1.selectByVisibleText("Groom");

        WebElement drpDowm2 = driver.findElement(By.id("sel1"));
        Select underDrpDown2 = new Select(drpDowm2);
        underDrpDown2.selectByIndex(7);

        WebElement drpDowm3 = driver.findElement(By.name("a2"));
        Select underDrpDown3 = new Select(drpDowm3);
        underDrpDown3.selectByIndex(11);

        WebElement drpDowm4 = driver.findElement(By.name("cm"));
        Select underDrpDown4 = new Select(drpDowm4);
        underDrpDown4.selectByValue("Hindu:Hindi");

        WebElement drpDowm5 = driver.findElement(By.name("ms"));
        Select underDrpDown5 = new Select(drpDowm5);
        underDrpDown5.selectByValue("1");

        WebElement drpDowm6 = driver.findElement(By.name("ph"));  //checkboxClick
        drpDowm6.click();

        driver.findElement(By.xpath("//*[@id=\"search\"]/div[4]/button")).click();  //clicking search button

        driver.close();
    }
}
