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

public class TestNG_Annotation_02 {
	@Test(groups="group1", priority =1)
    public void testCase1() {
        System.out.println("This is the Test Case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("This is the Test Case 2");
    }
    
    @Test(groups="group3", priority =3)
    public void testCase3() {
        System.out.println("This is the Test Case 3");
    }

    @Test(groups="group1", priority =2)
    public void testCase4() {
        System.out.println("This is the Test Case 4");
    }
    
    @Test(groups="group3")
    public void testCase5() {
        System.out.println("This is the Test Case 5");
    }
    
    @Test(groups="group2")
    public void testCase6() {
        System.out.println("This is the Test Case 6");
    }
    
    @Test(groups="group1", enabled = false)
    public void testCase7() {
        System.out.println("This is the Test Case 7");
    }
    
    @Test(groups="group2", priority =4)
    public void testCase8() {
        System.out.println("This is the Test Case 8");
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
