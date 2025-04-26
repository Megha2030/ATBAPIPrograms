package org.example.ex08_testNG_examples;

import org.testng.annotations.Test;

public class APITesting17_AlwaysRun {

    @Test
    public void test1()
    {
        System.out.println("test1");
    }

    @Test(alwaysRun = true)
    public void test2()
    {
        System.out.println("test2");
    }

    @Test
    public void test3()
    {
        System.out.println("test3");
    }

}
