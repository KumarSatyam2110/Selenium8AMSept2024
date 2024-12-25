package OtherImportant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollDemo {

    @Test
    public void ScrollDemo()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.nerolac.com/paintingservices/");

        WebElement subscribe = driver.findElement(By.xpath("//input[@id='edit-actions-submit--3']"));

        Actions actions = new Actions(driver);
        actions.scrollToElement(subscribe).perform();

        driver.findElement(By.id("edit-email--2")).sendKeys("Satyam@gmail.com");
        subscribe.click();
    }
}
