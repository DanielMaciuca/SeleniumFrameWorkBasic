package testngconcepts;
import org.testng.annotations.Test;

public class TestngDependOnGroups {

	@Test(groups= {"sanity1"})
	public void firstMethod_class1() {

		System.out.println("First Method Class 1");
	}

	@Test(dependsOnGroups= {"sanity1"})
	public void thirdMethod_class1() {

		System.out.println("Third Method Class 1");
	}

	@Test(groups = {"sanity1"})
	public void fourthMethod_class1() {

		System.out.println("Fourth Method Class 1");
	}
	
	@Test()
	public void secondMethod_class1() {

		System.out.println("Second Method Class 1");
	}
}
