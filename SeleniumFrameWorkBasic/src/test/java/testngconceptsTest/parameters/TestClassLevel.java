package testngconceptsTest.parameters;

import org.testng.annotations.Test;

@Test
public class TestClassLevel {

    public void myMethod1(){

        System.out.println("First method is public");

    }

    public void myMethod2(){

        System.out.println("Second method is public");

    }

    private void myMethod3(){

        System.out.println("Third method is private");
    }

}
