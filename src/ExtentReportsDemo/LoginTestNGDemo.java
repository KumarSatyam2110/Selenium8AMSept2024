package ExtentReportsDemo;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static ExtentReportsDemo.util.ForExtentReport.takeScreenShot;

public class LoginTestNGDemo {

    ExtentReports extent;

    //Before Setup
    @BeforeClass
    public void initExtent() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Exchange Report");
        reporter.config().setReportName("Regression Test");

        extent.setSystemInfo("createdBy", "Satyam");
        extent.setSystemInfo("project Start Date", "21-10-2024");
        extent.setSystemInfo("developer Name", "Sahil");
        extent.setSystemInfo("Tester Name", "Siddharth");
    }

    @AfterClass
    public void writeToReport() {
        extent.flush();
    }

    @Test
    public void LoginWithTestNG1() throws IOException {

        ExtentTest test = extent.createTest("valid Login");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");

        test.info("Webpage is opened");

        WebElement txtUserName = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUserName.sendKeys("admin");

        test.info("Username is entered");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("admin");

        test.info("Password is entered");

        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();

        test.info("Login Button is clicked");

        String expected = "Dashboard";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
        } catch (Exception e) {

        }
        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);
        try {
            Assert.assertEquals(actual, expected, "This is not a dashboard");
            test.info("Login Passed");
            test.addScreenCaptureFromPath("D:\\Screenshots");
        } catch (AssertionError e) {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/" + takeScreenShot(driver));
        }
    }

    @Test
    public void LoginWithTestNG2() throws IOException {

        ExtentTest test = extent.createTest("Invalid Login");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");
        test.info("Webpage is opened");

        WebElement txtUserName = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUserName.sendKeys("edderc");
        test.info("Username is entered");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("eccer");
        test.info("Password is entered");

        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();
        test.info("Login Button is clicked");


        String expected = "admin";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//a/strong[text()='admin']")).getText();
        }
        catch (Exception e) {

        }
        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);
        try {
            Assert.assertEquals(actual, expected, "This is not a dashboard");
            test.pass("Test is passed");
            test.addScreenCaptureFromPath("D:\\Screenshots");
        }
        catch (AssertionError e) {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/" + takeScreenShot(driver));

        }
    }

    @Test
    public void LoginWithTestNG3() throws IOException {

        ExtentTest test = extent.createTest("Blank Login");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");
        test.info("Webpage is opened");

        WebElement txtUserName = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUserName.sendKeys("");
        test.info("Username is entered");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("");
        test.info("Password is entered");

        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();
        test.info("Login Button is clicked");

        String expected = "Dashboard";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
        } catch (Exception e) {

        }
        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);
        try {
            Assert.assertEquals(actual, expected, "This is not a dashboard");
            test.pass("Test is passed");

        }
        catch (AssertionError e) {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/" + takeScreenShot(driver));
        }
    }

}
