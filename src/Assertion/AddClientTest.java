package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AddClientTest {

    @Test
    public void AddClient1() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");


        WebElement txtUserName = driver.findElement(By.id("login-username"));
        txtUserName.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin");

        WebElement btn = driver.findElement(By.name("submit"));
        btn.click();

        driver.findElement(By.partialLinkText("Add Cust")).click();


//        driver.findElement(By.name("name")).sendKeys("Rohit");
//        driver.findElement(By.name("contact1")).sendKeys("689795");
//        driver.findElement(By.name("contact2")).sendKeys("53232366");
//        driver.findElement(By.name("address")).sendKeys("Patna");
        driver.findElement(By.name("Submit")).click();

        String expected = "PLEASE ENTER A CUSTOMER NAME";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//label[@for='name']")).getText();
        } catch (Exception e) {

        }

        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);
        Assert.assertEquals(actual, expected, "Incorrect or No Error Message");

    }

    @Test
    public void AddClient2() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");


        WebElement txtUserName = driver.findElement(By.id("login-username"));
        txtUserName.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin");

        WebElement btn = driver.findElement(By.name("submit"));
        btn.click();

        driver.findElement(By.partialLinkText("Add Cust")).click();


        driver.findElement(By.name("name")).sendKeys("Rohit");
        driver.findElement(By.name("contact1")).sendKeys("689795");
        driver.findElement(By.name("contact2")).sendKeys("53232366");
        driver.findElement(By.name("address")).sendKeys("Patna");
        driver.findElement(By.name("Submit")).click();

        String expected = "PLEASE ENTER A CUSTOMER NAME";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//label[@for='name']")).getText();
        } catch (Exception e) {

        }

        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);
        Assert.assertEquals(actual, expected, "Incorrect or No Error Message");

    }

    @Test
    public void AddClient3() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");


        WebElement txtUserName = driver.findElement(By.id("login-username"));
        txtUserName.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin");

        WebElement btn = driver.findElement(By.name("submit"));
        btn.click();

        driver.findElement(By.partialLinkText("Add Cust")).click();

        String name = "Rohit28";
        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("contact1")).sendKeys("689795");
        driver.findElement(By.name("contact2")).sendKeys("53232366");
        driver.findElement(By.name("address")).sendKeys("Patna");
        driver.findElement(By.name("Submit")).click();

        String expected = "[ " + name + " ] Customer Details Added !";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
        } catch (Exception e) {

        }

        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);
        Assert.assertEquals(actual, expected, "Incorrect or No Error Message");

    }

    @Test
    public void AddClient4() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");

        WebElement txtUserName = driver.findElement(By.id("login-username"));
        txtUserName.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin");

        WebElement btn = driver.findElement(By.name("submit"));
        btn.click();

        driver.findElement(By.partialLinkText("Add Cust")).click();

//        driver.findElement(By.name("name")).sendKeys(name);
        //    driver.findElement(By.name("address")).sendKeys("Patna");
        driver.findElement(By.name("contact1")).sendKeys("68");
        driver.findElement(By.name("contact2")).sendKeys("66");

        driver.findElement(By.name("Submit")).click();

        ArrayList<String> expected = new ArrayList<>();
        expected.add("PLEASE ENTER A CUSTOMER NAME");
        expected.add("PLEASE ENTER AT LEAST 3 CHARACTERS.");
        expected.add("PLEASE ENTER AT LEAST 3 CHARACTERS.");

        ArrayList<String> actual = new ArrayList<>();
        try {
            List<WebElement> wbList = driver.findElements(By.xpath("//label[@class='error']"));
            for (WebElement wb : wbList)
                actual.add(wb.getText());
        } catch (Exception e) {

        }

        Assert.assertEquals(actual, expected);
    }

    //HOMEWORK
    @Test
    public void AddClient5() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");

        WebElement txtUserName = driver.findElement(By.id("login-username"));
        txtUserName.sendKeys("");
        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("");
        WebElement btn = driver.findElement(By.name("submit"));
        btn.click();

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("PLEASE ENTER A USERNAME");
        expected.add("PLEASE PROVIDE A PASSWORD");

        ArrayList<String> actual = new ArrayList<String>();
        try {
            List<WebElement> wbList1 = driver.findElements(By.xpath("//label[@class='error']"));
            for (WebElement wb1 : wbList1)
                actual.add(wb1.getText());
        } catch (Exception e) {

        }
        Assert.assertEquals(actual, expected);

    }
}


