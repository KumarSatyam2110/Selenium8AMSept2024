package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo3 {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> wbList = driver.findElements(By.tagName("a"));
        System.out.println(wbList.size());

        for (int i = 1; i<wbList.size();i++)
            System.out.println(wbList.get(i).getText());


//        for(WebElement wb : wbList)
//            System.out.println(wb.getText());
    }
}
