package testngconceptsTest.parameters;

import org.testng.annotations.Test;

public class TestnginvocationCount {

	@Test(invocationCount=3)
	public void myMethod() {

		System.out.println("This is my method");

	}
}
