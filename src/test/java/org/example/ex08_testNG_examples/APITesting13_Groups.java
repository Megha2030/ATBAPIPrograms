package org.example.ex08_testNG_examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting13_Groups {

    @Test(groups = {"sanity","reg"},priority = 1)
    public void test_sanityRun()
    {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"p0","reg"})
    public void test_regRun()
    {
        System.out.println("Regression");
        Assert.assertTrue(false);
    }

    @Test(groups = {"p1","reg"})
    public void test_smokeRun()
    {
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }
}
