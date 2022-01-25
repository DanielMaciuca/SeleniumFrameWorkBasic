package tests;
import org.testng.annotations.Test;

import pageobjects.MainPageAmazon;
import utils.Base;

public class AmazonMainPageTests extends Base {

	//Extends the Base Class in order to run @BeforeTest and @AfterTest
	
	@Test
	public void myMethod() {

		//create a Main page object in order to access the sendKeys function
		MainPageAmazon searchProduct = new MainPageAmazon();

		searchProduct.sendKeys("cars");
		
		searchProduct.clickSearchButton();

	}

}