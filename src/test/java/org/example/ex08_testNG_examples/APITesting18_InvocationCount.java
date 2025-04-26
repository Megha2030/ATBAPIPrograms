package org.example.ex08_testNG_examples;

import org.testng.annotations.Test;

public class APITesting18_InvocationCount {

    @Test(invocationCount = 5)
    public void test1()
    {
        System.out.println("test1");
    }



}
