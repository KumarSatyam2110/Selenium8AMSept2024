package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");

        List<WebElement> wbList = driver.findElements(By.className("round"));
        System.out.println(wbList.size());
        wbList.get(0).sendKeys("admin");
        wbList.get(1).sendKeys("admin");
        wbList.get(2).click();

    }
}
