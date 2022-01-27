package pageobjects;

import org.openqa.selenium.By;
import utils.Base;

public class MainPageAmazon extends Base{

	//Extends the Base class because the driver object is instantiated there

	By searchBox = By.id("twotabsearchtextbox");

	By searchButton = By.xpath("//input[@id='nav-search-submit-button\']");

	public void sendKeys(String text) {

		driver.findElement(searchBox).sendKeys(text);

	}

	public void clickSearchButton() {

		driver.findElement(searchButton).click();

	}

}
