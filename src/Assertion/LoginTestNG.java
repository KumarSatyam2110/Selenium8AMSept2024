package Assertion;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestNG {

    @Test
    public void LoginWithTestNG1() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");


        WebElement txtUserName = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUserName.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("admin");

        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();

        String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"This is not a dashboard");

    }

    @Test
    public void LoginWithTestNG2() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");


        WebElement txtUserName = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUserName.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("admin");

        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();

        String expected = "https://stock.scriptinglogic.in/dashboard.php";
        String actual = driver.getCurrentUrl();

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"This is not a dashboard");
    }

    @Test
    public void LoginWithTestNG3() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");


        WebElement txtUserName = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUserName.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("admin");

        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();

        String expected = "Dashboard";
        String actual= driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"This is not a dashboard");
    }
    @Test
    public void LoginWithTestNG4() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");


        WebElement txtUserName = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUserName.sendKeys("");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("");

        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();

        String expected = "Dashboard";
        String actual ="";
        try {
            actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
        }
        catch (Exception e){

        }
        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);

        Assert.assertEquals(actual, expected, "This is not a dashboard");
    }

    @Test
    public void LoginWithTestNG5() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");


        WebElement txtUserName = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUserName.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("admin");

        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();

        String expected = "Wrong Username or Password";
        String actual ="";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e){

        }
        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);

        Assert.assertEquals(actual, expected, "Incorrect or No Error message");
    }
}
