package org.example.ex08_testNG_examples;

import org.testng.annotations.Test;

public class APITesting12_Priority_Annotations {
    @Test(priority = 1)
    public void t1()
    {
        System.out.println("method1");
    }

    @Test(priority = 3)
    public void t2()
    {
        System.out.println("method2");
    }

    @Test(priority = 2)
    public void t3()
    {
        System.out.println("method3");
    }

    @Test(priority = 4)
    public void t4()
    {
        System.out.println("method4");
    }
}
