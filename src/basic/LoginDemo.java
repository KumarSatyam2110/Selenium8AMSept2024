package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");


        WebElement txtUserName = driver.findElement(By.id("login-username"));
        txtUserName.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin");

        WebElement btn = driver.findElement(By.name("submit"));
        btn.click();

        //driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.partialLinkText("Add Cust")).click();


        driver.findElement(By.name("name")).sendKeys("Siddhu");
        Thread.sleep(2000);
        driver.findElement(By.name("contact1")).sendKeys("9518892391");
        Thread.sleep(2000);
        driver.findElement(By.name("contact2")).sendKeys("7091976241");
        Thread.sleep(2000);
        driver.findElement(By.name("address")).sendKeys("Patna");
        Thread.sleep(2000);
        driver.findElement(By.name("Submit")).click();
    }
}
