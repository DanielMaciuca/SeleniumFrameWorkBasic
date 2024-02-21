package testngconceptsTest.parameters;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngDependsOnGroups {

    // You can control the execution of specific groups of tests from testng.xml file

    @Test(groups = {"sanity1"})
    public void firstMethod_class1() {

        System.out.println("First Method Class 1");

        String myString = "car";
        Assert.assertEquals("car", myString);
    }

    @Test(dependsOnGroups = {"sanity1"})
    public void thirdMethod_class1() {

        System.out.println("Third Method Class 1");
    }

    @Test(groups = {"sanity1"})
    public void fourthMethod_class1() {

        System.out.println("Fourth Method Class 1");
    }

    @Test(groups = {"Regression"})
    public void secondMethod_class1() {

        System.out.println("Second Method Class 1");
    }

    @Test(description = "ala bala portocala")
    public void lastMethod_class1() {

        System.out.println("Last Method Class 1");
    }
}
