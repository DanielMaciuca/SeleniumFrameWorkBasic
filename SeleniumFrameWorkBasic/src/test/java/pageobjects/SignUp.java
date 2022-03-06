package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Base;

public class SignUp extends Base {

	By cart = By.xpath("//a[@id='nav-cart']");

	By signUp = By.linkText("Sign up now");

	By customerName = By.xpath("//input[@id='ap_customer_name']");

	By customerEmail = By.xpath("//input[@id='ap_email']");

	public void addToCart() {

		driver.findElement(cart).click();
	}

	public void clickSignUpNow() {

		driver.findElement(signUp).click();
	}

	public void enterName() {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ap_customer_name']")));

		driver.findElement(customerName).sendKeys("valid user");
	}

	public void enterEmail() {

		driver.findElement(customerEmail).sendKeys("test@test.com");
	}
}





