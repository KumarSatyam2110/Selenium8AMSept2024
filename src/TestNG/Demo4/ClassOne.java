package TestNG.Demo4;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ClassOne {

    @Parameters({"url", "username", "password"})

    @Test
    public void ClassOneTest1(String url, String username, String password) {
        System.out.println("url="+url);
        System.out.println("username="+username);
        System.out.println("password="+password);
        System.out.println("ClassOneTest1");
    }

    @Test(groups = "email")
    public void ClassOneTest2() {
        System.out.println("ClassOneTest2");
    }

    @Test
    public void ClassOneTest3() {
        System.out.println("ClassOneTest3");
    }
}
