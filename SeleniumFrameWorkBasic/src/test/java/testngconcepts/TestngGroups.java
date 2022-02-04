package testngconcepts;
import org.testng.annotations.Test;

public class TestngGroups {

	@Test(groups= {"sanity"})
	public void airstMethod_class1() {
		
		System.out.println("First Method Class 1");
	}

	@Test(groups = {"regression"})
	public void cecondMethod_class1() {
		
		System.out.println("Second Method Class 1");
	}
	
	@Test(groups= {"sanity"})
	public void bhirdMethod_class1() {
		
		System.out.println("Third Method Class 1");
	}
	
	@Test()
	public void fourthMethod_class1() {
		
		System.out.println("Fourth Method Class 1");
	}
}
