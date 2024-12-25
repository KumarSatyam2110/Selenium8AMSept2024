package TestNG.Demo3;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassThree {

    @BeforeSuite
    public void BeforeMySuite() {
        System.out.println("Before My Suite");
    }

    @AfterSuite
    public void AfterMySuite(){
        System.out.println("After My Suite");
    }

    @Test
    public void ClassThreeTest1() {
        System.out.println("ClassThreeTest1");
    }

    @Test (groups = "email")
    public void ClassThreeTest2() {
        System.out.println("ClassThreeTest2");
    }

    @Test
    public void ClassThreeTest3() {
        System.out.println("ClassThreeTest3");
    }
}
