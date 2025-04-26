package org.example.ex08_testNG_examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting15_Priority {

    @Parameters("browser")
    @Test
    public void demo1(String value)
    {
        System.out.println("Demo 1 TC");

        if(value.equalsIgnoreCase("chrome"))
        {
            System.out.println("start in chrome browser");
        }

        if(value.equalsIgnoreCase("Edge"))
        {
            System.out.println("start in edge browser");
        }
    }
}
