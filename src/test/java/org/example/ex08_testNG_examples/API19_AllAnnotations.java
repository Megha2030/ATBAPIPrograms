package org.example.ex08_testNG_examples;

import org.testng.annotations.*;

public class API19_AllAnnotations {
    @Test
    public void test1() {
        System.out.println("Test Case 1");
    }
    @Test
    public void test2() {
        System.out.println("Test Case 2");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will Execute Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will Execute After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will Execute Before Class Execution");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will Execute After Class Execution");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will Execute Before Test ");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("This will Execute After Test ");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will Execute Before Suite ");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This will Execute After Suite ");
    }

}
