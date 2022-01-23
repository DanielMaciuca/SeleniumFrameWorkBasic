package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties prop = new Properties();	
	public static InputStream input ;

	@BeforeTest
	public void SetUpTest() throws IOException {

		if (driver==null) {

			String projectPath = System.getProperty("user.dir");
			InputStream input = new FileInputStream(projectPath + "\\src\\test\\resources\\config.properties");
			prop.load(input);
		}

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {

			//WebDriver driver = new ChromeDriver(); --won't work it will be a new object
			WebDriverManager.chromedriver().setup();			
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.get(prop.getProperty("url"));
		}

		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));

		}
	}

	@AfterTest
	public void tearDown() {

		driver.close();
	}

}