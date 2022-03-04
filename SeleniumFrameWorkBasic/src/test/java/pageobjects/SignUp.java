package pageobjects;

import org.openqa.selenium.By;

import utils.Base;

public class SignUp extends Base {

	By cart = By.xpath("//a[@id='nav-cart']");
	
	By signUp = By.className("a-size-base-plus");

	public void addToCart() {

		driver.findElement(cart).click();
	}
	
	public void click() {
		
		driver.findElement(signUp).click();
	}
}


