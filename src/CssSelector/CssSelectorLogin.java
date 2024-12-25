package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLogin {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        driver.findElement(By.cssSelector("#login-username")).sendKeys("admin");
        driver.findElement(By.cssSelector("#login-password")).sendKeys("admin");
        driver.findElement(By.cssSelector(("input.button"))).click();

        driver.findElement(By.cssSelector("a[href='add_customer.php']")).click();

        driver.findElement(By.cssSelector("[placeholder*='YOUR FULL']")).sendKeys("Visht2");
        driver.findElement(By.cssSelector("#buyingrate")).sendKeys("9564512909");
        driver.findElement(By.cssSelector("#sellingrate")).sendKeys("8976508631");
        driver.findElement(By.cssSelector("textarea[name='address']")).sendKeys("London");
        driver.findElement(By.cssSelector("[value='Add']")).click();

        Thread.sleep(4000);

        driver.quit();
    }
}
