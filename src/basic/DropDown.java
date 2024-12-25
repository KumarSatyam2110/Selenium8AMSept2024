package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        Thread.sleep(4000);

        WebElement drpDown = driver.findElement(By.id("seltext"));
        //drpDown.sendKeys("text4");

        Select underDrpDwn = new Select(drpDown);
      //  underDrpDwn.selectByValue("val1");
       // underDrpDwn.selectByVisibleText("text 4");
        underDrpDwn.selectByIndex(4);
    }
}
