package org.example.ex08_testNG_examples;

import org.testng.annotations.Test;

public class APITesting16_Enabled {

    @Test
    public void test1()
    {
        System.out.println("test1");
    }

    @Test(enabled = false)
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
