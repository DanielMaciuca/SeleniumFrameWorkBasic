package pageobjects;

import org.openqa.selenium.By;
import utils.Base;

public class MainPage extends Base{
	
	//Extends the Base class because the driver object is instantiated there
		
	By searchBox = By.id("twotabsearchtextbox");

	public void sendKeys(String text) {
		
		driver.findElement(searchBox).sendKeys(text);

	}

}
