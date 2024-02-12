package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import Log4j.Log4jDemo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties prop = new Properties();	
	public static InputStream input ;
	public static Logger logger = LogManager.getFormatterLogger(Base.class);

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
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			driver = new ChromeDriver(options);
			driver.get("https://www.amazon.com/");
			driver.get(prop.getProperty("url"));
			logger.info("Browser is Chrome");
		}

		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));
			logger.info("Browser is Firefox");

		}
	}


	@AfterTest public void tearDown() {
		driver.quit(); logger.info("Browser was closed"); }
}