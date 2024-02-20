package testngconceptsTest.parameters;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngAlwayRun {

    @Test()
    public void a_First() {

        String myString = "test";
        Assert.assertEquals(myString, "test2");
        System.out.println("First Method");
    }

    @Test(dependsOnMethods = {"a_First"}, alwaysRun = true)
    public void b_Second() {
        System.out.println("Second method");
    }
}
