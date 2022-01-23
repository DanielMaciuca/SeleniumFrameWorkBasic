package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Base;

public class AmazonMainPage extends Base {

	@Test
	public void myMethod() {

		WebElement textsearch = driver.findElement(By.id("twotabsearchtextbox"));

		textsearch.sendKeys("portocala");

	}

}