package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseOriginal {

	public static String browserName = "chrome";
	public static WebDriver driver;
	public static Properties prop = new Properties();	
	public static InputStream input ;

	@BeforeTest
	public static void SetUpTest() throws IOException {

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