package TestNG.Demo3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassOne {

    @BeforeTest
    public void BeforeMyTest(){
        System.out.println("Before My Test");
    }

    @AfterTest
    public void AfterMyTest(){
        System.out.println("After My Test");
    }

    @Test
    public void ClassOneTest1(){
        System.out.println("ClassOneTest1");
    }

    @Test (groups = "email")
    public void ClassOneTest2(){
        System.out.println("ClassOneTest2");
    }

    @Test
    public void ClassOneTest3(){
        System.out.println("ClassOneTest3");
    }
}
