package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        Thread.sleep(4000);

        WebElement msdd = driver.findElement(By.id("multiSel"));
        Select DrpMultiSel = new Select(msdd);

        DrpMultiSel.selectByIndex(3);
        DrpMultiSel.selectByIndex(2);
        DrpMultiSel.selectByVisibleText("text 5");

        Thread.sleep(4000);

//        DrpMultiSel.deselectByIndex(2);
//        DrpMultiSel.deselectByIndex(3);

        DrpMultiSel.deselectAll();
    }
}
