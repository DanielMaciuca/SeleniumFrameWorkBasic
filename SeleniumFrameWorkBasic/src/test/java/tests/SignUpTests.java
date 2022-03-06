package tests;

import org.testng.annotations.Test;

import pageobjects.SignUp;
import utils.Base;

public class SignUpTests extends Base {

	//different approach with only one object created
	//I don't like it because the name is the same, not sure what to say

	public SignUp signUp = new SignUp();

	@Test (priority = 1)
	public void go() {

		System.out.println("I am on signup page");

		signUp.addToCart();	
	}
	@Test (priority = 2)
	public void signUp() {

		signUp.clickSignUpNow();
	}

	@Test (priority = 3)
	public void enterName() {

		signUp.enterName();

	}

	@Test (priority = 4)
	public void enterEmail() {

		signUp.enterEmail();

	}
}
