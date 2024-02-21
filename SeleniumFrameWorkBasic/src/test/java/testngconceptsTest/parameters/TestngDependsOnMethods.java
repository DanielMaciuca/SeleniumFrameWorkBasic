package testngconceptsTest.parameters;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngDependsOnMethods {

    // Method will be executed only if the dependency was executed successfully
    // In case the dependency is not executed successfully, the test will be skipped
    // If First() fails the Second() will be skipped

    @Test()
    public void First() {

        System.out.println("First method");

    }

    @Test(dependsOnMethods = {"First"})
    public void Second() {

        System.out.println("Second method");
    }

    @Test()
    public void Third() {

        System.out.println("Third method");

    }

}
