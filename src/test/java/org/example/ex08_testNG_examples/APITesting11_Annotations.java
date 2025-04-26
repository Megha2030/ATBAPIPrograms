package org.example.ex08_testNG_examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting11_Annotations {

    @BeforeTest
    public void getToken()
    {
        System.out.println("1");
    }

    @BeforeTest
    public void getBookingId()
    {
        System.out.println("2");
    }

    @Test
    public void putTest()
    {
        System.out.println("3");
    }

    @AfterTest
    public void closeAll()
    {
        System.out.println("4");
    }
    
}
