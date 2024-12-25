package TestNG.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISites extends Base{



    @Test
    public void openOpenAI() {
        driver.get("http://openai.com");
    }

    @Test
    public void openDeepMind() {
        driver.get("http://deepmind.com");
    }

    @Test
    public void openAnthropic() {
        driver.get("http://anthropic.com");
    }

    @Test
    public void openStabilityAI() {
        driver.get("http://stability.ai");
    }

    @Test
    public void openHuggingFace() {
        driver.get("http://huggingface.co");
    }

}
