package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static String browserName = "firefox";

	public static WebDriver driver;

	@BeforeTest
	public static void SetUpTest() {

		if (browserName.equalsIgnoreCase("chrome")) {

			//WebDriver driver = new ChromeDriver(); --won't work
			WebDriverManager.chromedriver().setup();			
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
		}

		else if(browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.amazon.com/");

		}
	}

	@AfterTest
	public void tearDown() {

		driver.close();
	}

}