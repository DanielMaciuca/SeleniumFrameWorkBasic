package testngconceptsTest.parameters;

import org.testng.annotations.Test;

public class TestngEnabled {

// If enabled = false, the method will be skipped during the test run

    @Test(enabled = true)
    public void firstMethod() {

        System.out.println("First Method");
    }

    @Test
    public void secondMethod() {

        System.out.println("Second Method");
    }


}
