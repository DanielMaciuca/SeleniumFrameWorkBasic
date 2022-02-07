package testngconceptsTest.parameters;

import org.testng.annotations.Test;

public class TestngEnabled {


	@Test(enabled = false)
	public void firstMethod() {

		System.out.println("First Method");
	}
	@Test
	public void secondMethod() {

		System.out.println("Second Method");
	}


}
