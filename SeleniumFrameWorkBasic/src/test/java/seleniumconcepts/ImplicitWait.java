package seleniumconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		//page LoadTimeout
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2\r\n"+ "");

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button")).click();

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println(driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).isDisplayed());

		//Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).isDisplayed(), true);

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		//driver.quit();
		//only a comment
		//second comment
	}

}
