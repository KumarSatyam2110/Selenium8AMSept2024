package TestNG.Demo4;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {


    @Parameters({"url", "username", "password"})

    @Test
    public void ClassTwoTest1(String url, String username, String password) {
        System.out.println("url="+url);
        System.out.println("username="+username);
        System.out.println("password="+password);
        System.out.println("ClassTwoTest1");
    }

    @Test(groups = "email")
    public void ClassTwoTest2() {
        System.out.println("ClassTwoTest2");
    }

    @Test
    public void ClassTwoTest3() {
        System.out.println("ClassTwoTest3");
    }
}
