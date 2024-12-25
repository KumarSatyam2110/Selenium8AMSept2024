package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo_HomeWork {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement txtUsername = driver.findElement(By.name("username"));
        txtUsername.sendKeys("tomsmith");

        WebElement txtPass = driver.findElement(By.id("password"));
        txtPass.sendKeys("SuperSecretPassword!");

        WebElement btn = driver.findElement(By.xpath("//button"));
        btn.click();

        Thread.sleep(5000);
        driver.close();
    }
}
