package testngconceptsTest.parameters;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngAlwayRun {

    // If the first method fails the second will be ignored
    // If you have alwaysRun = true, the second method will not be ignored anymore

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
