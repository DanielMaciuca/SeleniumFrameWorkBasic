package seleniumconcepts;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.emag.ro/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// By.ID

		//driver.findElement(By.id("searchboxTrigger")).click();

		// By.NAME

		//driver.findElement(By.name("query")).click();

		// By.CLASS

		driver.manage().window().maximize();

		//driver.findElement(By.className("caret")).click();

		//By.TAGNAME - Verifying the number of links from a page

		//driver.findElement(By.tagName("img")).click();

		// By.LINKTEXT

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//driver.findElement(By.linkText("eMAG Genius")).click();
		
		//By.PARTIALLINKTEXT
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//driver.findElement(By.partialLinkText("eMAG")).click();
		
		driver.findElement(By.partialLinkText("PC")).click();
	}

}
