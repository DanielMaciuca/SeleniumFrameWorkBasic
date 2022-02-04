package testngconcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class3 {

	@BeforeClass
	public void beforeClass_3() {

		System.out.println("Before Class 3");

	}

	@Test
	public void firstMethod_class3() {

		System.out.println("First Method Class 3");
	}

	@Test
	public void secondMethod_class3() {

		System.out.println("Second Method Class 3");
	}

	@Test
	public void thirdMethod_class3() {

		System.out.println("Third Method Class 2");
	}

}
