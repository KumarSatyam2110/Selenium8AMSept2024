package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_homework1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.in/");

        WebElement txtUserName = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUserName.sendKeys("admin");
        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("admin");
        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();

        WebElement stockbtn= driver.findElement(By.xpath("//a[@href='view_product.php']"));
        stockbtn.click();
        WebElement addStockbtn= driver.findElement(By.xpath("//a[@href='add_stock.php']"));
        addStockbtn.click();

        WebElement stockId = driver.findElement(By.xpath("//input[@name='stockid']"));
        stockId.sendKeys("CD76");
        WebElement stockName = driver.findElement(By.xpath("//input[@name='name']"));
        stockName.sendKeys("Coforge");
        WebElement stockCost = driver.findElement(By.xpath("//input[@id='cost']"));
        stockCost.sendKeys("6233.5");
        WebElement stockSell = driver.findElement(By.xpath("//input[@id='sell']"));
        stockSell.sendKeys("6795.8");
        WebElement stockSupplier = driver.findElement(By.xpath("//input[@id='supplier']"));
        stockSupplier.sendKeys("Real Madrid");
        WebElement stockCategory = driver.findElement(By.xpath("//input[@id='category']"));
        stockCategory.sendKeys("RealState");
        WebElement btnSub = driver.findElement(By.xpath("//input[@type='submit']"));
        btnSub.click();
    }
}
