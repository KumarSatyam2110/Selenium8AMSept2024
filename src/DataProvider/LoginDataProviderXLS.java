package DataProvider;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginDataProviderXLS {

    @Test(dataProvider = "getData")
    public void LoginTest(String username, String password) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");


        WebElement txtUserName = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUserName.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys(password);

        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();
    }

    @DataProvider
    Object[][] getData() throws IOException {


        //read the file
        FileInputStream fis = new FileInputStream("data/mydata2.xlsx");

        //convert the file object into workbook object
        XSSFWorkbook workbook= new XSSFWorkbook(fis);

        //get the sheet where the data is
        XSSFSheet sheet = workbook.getSheet("data");
        int rowCount = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount][2];

        for (int i =0; i<rowCount;i++)
        {
           XSSFRow row = sheet.getRow(i);

           data[i][0] =row.getCell(0).toString();
           data[i][1] =row.getCell(1).toString();
        }

        return data;

    }
}
