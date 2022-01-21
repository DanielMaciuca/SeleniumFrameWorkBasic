package uiTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class MainPage {

	@Test
	public void myMethod() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement textsearch = driver.findElement(By.id("twotabsearchtextbox"));
		
		textsearch.sendKeys("portocala");
		
		
		


	}


}
