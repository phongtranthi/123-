package webdriver_10_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Priority {
	@Test( priority =1)
    public void testCase1() {
        System.out.println("This is the Test Case 1");
    }

    @Test (enabled=false )
    public void testCase2() {
        System.out.println("This is the Test Case 2");
    }
    
    @Test(priority =3)
    public void testCase3() {
        System.out.println("This is the Test Case 3");
    }

    @Test(priority =2)
    public void testCase4() {
        System.out.println("This is the Test Case 4");
    }
    @Test
    public void testCase5() {
        System.out.println("This is the Test Case 5");
    }
   
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite");
    }
}
