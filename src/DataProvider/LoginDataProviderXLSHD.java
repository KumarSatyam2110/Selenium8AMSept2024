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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginDataProviderXLSHD {

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
        FileInputStream fis = new FileInputStream("data/myData_2.xlsx");

        //convert the file object into workbook object
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        //get the sheet where the data is
        XSSFSheet sheet = workbook.getSheet("data2");
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount - 1][2];

        for (int i = 0; i < rowCount - 1; i++) {
            XSSFRow row = sheet.getRow(i + 1);


            for (int j = 0; j < colCount; j++) {
                XSSFCell cell = row.getCell(j);


                if (cell == null)
                    data[i][j] = "";
                else {
                    cell.setCellType(CellType.STRING);
                    data[i][j] = cell.toString();
                }
            }
        }

        return data;

    }
}
