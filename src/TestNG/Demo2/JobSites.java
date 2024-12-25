package TestNG.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites extends Base {


    @Test
    public void openIndeed() {
        driver.get("http://indeed.com");
    }

    @Test
    public void openMonster() {
        driver.get("http://monster.com");
    }

    @Test
    public void openGlassdoor() {
        driver.get("http://glassdoor.com");
    }

    @Test
    public void openLinkedInJobs() {
        driver.get("http://linkedin.com/jobs");
    }

    @Test
    public void openCareerBuilder() {
        driver.get("http://careerbuilder.com");
    }
}
