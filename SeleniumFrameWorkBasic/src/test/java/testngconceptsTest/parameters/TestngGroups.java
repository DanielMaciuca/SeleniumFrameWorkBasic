package testngconceptsTest.parameters;
import org.testng.annotations.Test;

public class TestngGroups {

	// Test Methods

	@Test(groups= {"sanity"})
	public void firstMethod_class1() {
		
		System.out.println("First Method Class 1");
	}

	@Test(groups = {"regression"})
	public void secondMethod_class1() {
		
		System.out.println("Second Method Class 1");
	}
	
	@Test(groups= {"sanity"})
	public void thirdMethod_class1() {
		
		System.out.println("Third Method Class 1");
	}
	
	@Test()
	public void fourthMethod_class1() {
		
		System.out.println("Fourth Method Class 1");
	}
}
