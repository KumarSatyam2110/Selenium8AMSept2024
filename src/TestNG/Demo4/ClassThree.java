package TestNG.Demo4;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {

    @BeforeSuite
    public void BeforeMySuite() {
        System.out.println("Before My Suite");
    }

    @AfterSuite
    public void AfterMySuite() {
        System.out.println("After My Suite");
    }


    @Parameters({"url", "username", "password"})

    @Test
    public void ClassThreeTest1(String url, String username, String password) {
        System.out.println("url="+url);
        System.out.println("username="+username);
        System.out.println("password="+password);
        System.out.println("ClassThreeTest1");
    }

    @Test(groups = "email")
    public void ClassThreeTest2() {
        System.out.println("ClassThreeTest2");
    }

    @Test
    public void ClassThreeTest3() {
        System.out.println("ClassThreeTest3");
    }
}
