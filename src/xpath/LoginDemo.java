package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {
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


        WebElement addCust = driver.findElement(By.xpath("//a[@href='add_customer.php']"));
        addCust.click();

        WebElement inpname = driver.findElement(By.xpath("//input[@name='name']"));
        inpname.sendKeys("Akansha");

        WebElement contact1 = driver.findElement(By.xpath("//input[@name='contact1']"));
        contact1.sendKeys("8797103202");

        WebElement contact2 = driver.findElement(By.xpath("//input[@name='contact2']"));
        contact2.sendKeys("9308103565");

        WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
        address.sendKeys("Madhubani");

        WebElement addbtn = driver.findElement(By.xpath("//input[@type='submit']"));
        addbtn.click();
    }
}
