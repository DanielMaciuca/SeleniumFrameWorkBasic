package tests;

import org.testng.annotations.Test;

import pageobjects.SignUp;
import utils.Base;

public class SignUpTests extends Base {
	
	
	@Test
	public void go() {
		
		System.out.println("I am in signup page");
		
		SignUp cart = new SignUp();
		
		cart.addToCart();	
	}
	@Test
	public void signUp() {
		
		System.out.println("I am in signup page");
		
		SignUp signUp = new SignUp();
		
		signUp.click();
	}
}
