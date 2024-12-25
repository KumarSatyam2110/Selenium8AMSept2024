package JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginJUnit2 {

    WebDriver driver;

  @Before  // this method will execute before every test method
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After // this method will execute after every test method
    public void closeBrowser()
    {
        driver.quit();
    }

    @Test
    public void LoginWithJUnit1() {

        driver.get("http://stock.scriptinglogic.in/");

        WebElement txtUserName = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUserName.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("admin");

        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();
    }

    @Test
    public void LoginWithJUnit2() {

        driver.get("http://stock.scriptinglogic.in/");

        WebElement txtUserName = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUserName.sendKeys("dvvfvv");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("cscrc");

        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();
    }

    @Test
    public void LoginWithJUnit3() {

        driver.get("http://stock.scriptinglogic.in/");

        WebElement txtUserName = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUserName.sendKeys("");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("");

        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();
    }
}
