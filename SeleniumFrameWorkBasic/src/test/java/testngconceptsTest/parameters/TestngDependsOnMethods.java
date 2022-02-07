package testngconceptsTest.parameters;

import org.testng.annotations.Test;

public class TestngDependsOnMethods {

	@Test()
	public void b_First() {

		System.out.println("First method");
	}

	@Test(dependsOnMethods= {"b_First"})
	public void a_Second() {

		System.out.println("Second method");
	}

}
