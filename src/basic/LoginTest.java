package basic;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        // Create an instance of the ChromeDriver (this opens the browser)
        WebDriver driver = new ChromeDriver();

        try {
            // Step 1: Navigate to the login page
            driver.get("http://stock.scriptinglogic.in/");


            WebElement txtUserName = driver.findElement(By.id("login-username"));
            txtUserName.sendKeys("admin");

            WebElement txtPassword = driver.findElement(By.name("password"));
            txtPassword.sendKeys("admin");

            WebElement btn = driver.findElement(By.name("submit"));
            btn.click();
           String v=  driver.getTitle();
            System.out.println(v);

            // Step 5: Verify if the URL contains "/dashboard" after login
            String currentUrl = driver.getCurrentUrl();
            if (currentUrl.contains("https://stock.scriptinglogic.in/dashboard.php")) {
                System.out.println("Login successful, user is on the dashboard page.");
            } else {
                System.out.println("Login failed, user is not on the dashboard page.");
            }

            // Step 6: Verify if the dashboard element is displayed
            WebElement dashboardElement = driver.findElement(By.xpath("//a[@href='dashboard.php']"));
            if (dashboardElement.isDisplayed()) {
                System.out.println("Dashboard is displayed. User is logged in successfully.");
            } else {
                System.out.println("Dashboard is not displayed. Login failed.");
            }

        } catch (Exception e) {
            System.out.println("Test encountered an error: " + e.getMessage());
        }
//        finally {
//            // Close the browser
//            //driver.quit();
//        }
    }
}