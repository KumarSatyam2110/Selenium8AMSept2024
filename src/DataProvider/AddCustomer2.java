package DataProvider;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import static DataProvider.util.ForDataProvider.getMyData;

public class AddCustomer2 {

    WebDriver driver;

    @BeforeClass
    public void doLogin(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");


        WebElement txtUserName = driver.findElement(By.id("login-username"));
        txtUserName.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin");

        WebElement btn = driver.findElement(By.name("submit"));
        btn.click();
    }

    @Test (dataProvider = "getData")
    public void addCustomerTest(String name, String address, String contact1, String contact2) {


        driver.findElement(By.partialLinkText("Add Cust")).click();

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("contact1")).sendKeys(address);
        driver.findElement(By.name("contact2")).sendKeys(contact1);
        driver.findElement(By.name("address")).sendKeys(contact2);
        driver.findElement(By.name("Submit")).click();

    }

    @DataProvider()
    Object[][] getData() throws IOException {

        Object[][] data = getMyData("data/AddCustomer.xlsx", "addCust");

        return data;
    }
}
