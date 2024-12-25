package TestNG.Demo2;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites extends Base {


    @Test (priority = 4)
    public void openFacebook() {

        driver.get("http://facebook.com");
        Assert.assertEquals(driver.getTitle(), "gmail.com","This is not a Facebook Login Page" );
    }

    @Test (priority = 3)
    public void openGmail() {

        driver.get("http://gmail.com");
    }

    @Test (priority = 5)
    public void openLinkedin() {

        driver.get("http://linkedin.com");
    }

    @Test (priority = 1)
    public void openInstagram() {

        driver.get("http://instagram.com");
    }
    @Test (priority = 2)
    public void openYoutube() {

        driver.get("http://youtube.com");
    }
}
