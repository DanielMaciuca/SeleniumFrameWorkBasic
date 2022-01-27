package seleniumconcepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.emag.ro/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// By.id

		//driver.findElement(By.id("searchboxTrigger")).click();

		// By.name

		//driver.findElement(By.name("query")).click();

		// By.class

		driver.findElement(By.className("visible-lg-inline")).click();

		// By.LinkText
		
		//driver.findElement(By.linkText("eMAG Genius")).click();
		
	}

}
