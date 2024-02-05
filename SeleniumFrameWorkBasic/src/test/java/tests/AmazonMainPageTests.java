package tests;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.MainPageAmazon;
import utils.Base;

//https://www.youtube.com/watch?v=wXnoK-MivP4&list=PL5fOKT7XR42Om0spD8QtxuQ4Y9ONra6dq&index=10

public class AmazonMainPageTests extends Base {

	//Extends the Base Class in order to run @BeforeTest and @AfterTest

	@Test(priority=0)
	public void enterProduct() {

		//create a Main page object in order to access the sendKeys function.

		MainPageAmazon input  = new MainPageAmazon();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		input.sendKeys("cars");

	}

	@Test(priority=1)
	public void searchProduct() {

		MainPageAmazon search = new MainPageAmazon();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		search.clickSearchButton();
	}

	@Test(priority=2)
	public void add() {	

		MainPageAmazon add = new MainPageAmazon();
		add.addToCart();

	}


	
	  @Test
	  
	  public void method() {
	  
	  String a = "car";
	  
	  Assert.assertEquals(a, "cars");
	  
	  }
	 



}
