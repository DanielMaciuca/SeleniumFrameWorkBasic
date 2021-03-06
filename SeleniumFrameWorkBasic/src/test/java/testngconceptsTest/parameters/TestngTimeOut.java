package testngconceptsTest.parameters;
import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobjects.MainPageAmazon;
import utils.Base;

@Listeners({utils.Listeners.class})

public class TestngTimeOut extends Base{

	@Test(priority = 0, timeOut=1)

	public void enterProduct() {

		//create a Main page object in order to access the sendKeys function
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		add.addToCart();

	}


}