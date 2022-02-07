package testngconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {

	@Test
	public void myMethod() {

		String myString = "test";

		Assert.assertEquals(myString, "test");

	}

	@Test
	public void myMethod2() {

		int a = 5;

		Assert.assertTrue(a > 4);

	}

	@Test
	public void myMethod3() {

		int a = 5;

		Assert.assertFalse(a < 4);

	}

	@Test
	public void myMethod5() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://emag.ro/");

	}
}
