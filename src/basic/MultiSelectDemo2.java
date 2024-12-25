package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        WebElement hmsd = driver.findElement(By.id("source_118"));
        Select joblocation = new Select(hmsd);
        joblocation.selectByIndex(1);
        joblocation.selectByVisibleText("Mumbai");
        joblocation.selectByValue("4215");

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();

        WebElement deselect = driver.findElement(By.id("fld_118"));
        Select removeLocation = new Select(deselect);
        removeLocation.selectByVisibleText("Mumbai");
        removeLocation.selectByIndex(0);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();
    }
}
