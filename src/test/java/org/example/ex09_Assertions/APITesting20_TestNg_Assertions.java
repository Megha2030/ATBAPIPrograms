package org.example.ex09_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting20_TestNg_Assertions {

    //Hard Assertions
   @Test
    public void hardAssertion()
    {
        System.out.println("test start");
        Assert.assertEquals("megha","Megha"); //validation fails so other stmts are not executed
        System.out.println("end of test");
    }

    //Soft Assertion
    @Test
    public void softAssertion()
    {
        SoftAssert sa = new SoftAssert();
        System.out.println("test start");
        sa.assertEquals("megha","Megha"); //validation fails, but other stmt are executed
        System.out.println("end of test");
        sa.assertAll();
    }
}
