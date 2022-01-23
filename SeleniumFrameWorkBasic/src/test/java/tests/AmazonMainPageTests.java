package tests;
import org.testng.annotations.Test;

import pageobjects.MainPage;
import utils.Base;

public class AmazonMainPageTests extends Base {

	//Extends the Base Class in order to run @BeforeTest and @AfterTest
	
	@Test
	public void myMethod() {

		//create a Main page object in order to access the sendKeys function
		MainPage searchProduct = new MainPage();

		searchProduct.sendKeys("cars");

	}

}