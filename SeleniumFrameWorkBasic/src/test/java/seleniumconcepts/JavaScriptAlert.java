package seleniumconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlert {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/javascript_alerts");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		//simple alert -> display some information or warning
		driver.switchTo().alert().accept();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//confirmation alert -> ask permission to do something

	}

}
