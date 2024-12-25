package xpath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletefromRecord {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");


        WebElement txtUserName = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUserName.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("admin");

        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();


        WebElement addCust = driver.findElement(By.xpath("//a[@href='add_customer.php']"));
        addCust.click();

        WebElement viewCust = driver.findElement(By.xpath("//a[@href='view_customers.php']"));
        viewCust.click();


       // String name = "Akansha";
        driver.findElement(By.xpath("//tr[td[text()='Sahil']]/td/input")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//tr[td[text()='Sahil']]//a[contains(@href,'delete')]")).click();

        Thread.sleep(4000);
        Alert alert = driver.switchTo().alert();
        alert.accept();





    }
}
