package Tests;
import org.testng.annotations.Test;

import pageObjects.MainPage;
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