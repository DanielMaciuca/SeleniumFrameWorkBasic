package seleniumconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		//page LoadTimeout
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2\r\n"+ "");

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println(driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).isDisplayed());

		//Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).isDisplayed(), true);

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		//driver.quit();
		//only a comment
		//second comment
	}

}
