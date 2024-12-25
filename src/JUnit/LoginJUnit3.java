package JUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginJUnit3 {

    static WebDriver driver;

    @BeforeClass  // this method will execute before first test method of every class
    public static void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass // this method will execute after last test method of every class
    public static void closeBrowser()
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
       // btn.click();
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
