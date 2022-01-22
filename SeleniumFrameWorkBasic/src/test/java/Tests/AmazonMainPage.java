package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class AmazonMainPage {
	
	public static String browserName = "firefox";
	
	WebDriver driver;
	
	@BeforeTest
	
	public void SetUpTest() {
		
		
		if (browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			//WebDriver driver = new ChromeDriver(); --won't work
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.amazon.com/");
			
		}
	}
	

	@Test
	public void myMethod() {
		
	
		WebElement textsearch = driver.findElement(By.id("twotabsearchtextbox"));
		
		textsearch.sendKeys("portocala");
			
	}

	@AfterTest
	
	public void tearDown() {
		
		driver.close();
	}

}