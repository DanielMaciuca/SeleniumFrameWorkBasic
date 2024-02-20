package testngconceptsTest.parameters;

import org.testng.annotations.Test;

public class TestngDependsOnMethods {

    // Method will be executed only if the dependency was executed successfully
    // In this case Third will be executed only if Second was executed

    @Test()
    public void First() {

        System.out.println("First method");
    }

    @Test(dependsOnMethods = {"First"})
    public void Second() {

        System.out.println("Second method");
    }

    @Test(dependsOnMethods = {"Second"})
    public void Third() {

        System.out.println("Third method");

    }

}
