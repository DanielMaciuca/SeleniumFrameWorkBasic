package seleniumconcepts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlert {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/javascript_alerts");

		// We can handle alerts in Selenium webdriver by using the Alert interface
		// It works directly  without using the Alert interface, maybe is only for handling the code better
		// Also works with driver.switchTo().alert().accept() directly

		//simple alert -> displays some information or warning

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();	

		Alert myAlert1 = driver.switchTo().alert();

		myAlert1.accept();

		//confirmation alert -> asks permission to do something, Cancel is pressed

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		Alert myAlert2 = driver.switchTo().alert();

		myAlert2.dismiss();

		//prompt alert -> asks input from the user

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		Alert myAlert3 = driver.switchTo().alert();

		//DOESN'T WORK
		myAlert3.sendKeys("This is as test");

		//System.out.println(myAlert3.getText());
	}

}
