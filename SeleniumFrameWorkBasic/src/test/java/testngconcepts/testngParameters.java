package testngconcepts;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class testngParameters {
	
	@Test
	@Parameters({"Name", "Age"})
	public void method(String nume, int varsta) {

		System.out.println(nume + " " +  varsta);

	}

	@Test
	@Parameters({"SecondName"})
	public void method2(@Optional("Maciuca") String nume) {

		System.out.println(nume);

	}
}
