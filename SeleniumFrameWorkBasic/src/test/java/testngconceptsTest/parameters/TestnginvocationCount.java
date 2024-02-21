package testngconceptsTest.parameters;

import org.testng.annotations.Test;

public class TestnginvocationCount {

	// How many times the same method will be invoked an executed

	@Test(invocationCount=3)
	public void myMethod() {
		System.out.println("This is my method");
	}
}
