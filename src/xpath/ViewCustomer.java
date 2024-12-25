package xpath;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ViewCustomer {
    public static void main(String[] args) {
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


        String name = "Akansha";
        driver.findElement(By.xpath("//tr[td[text()='"+name+"']]/td/input")).click();
        //driver.findElement(By.xpath("//tr[td[a[@href='delete.php?id=752&table=customer_details&return=view_customers.php']]]/td/input")).click();




    }
}
