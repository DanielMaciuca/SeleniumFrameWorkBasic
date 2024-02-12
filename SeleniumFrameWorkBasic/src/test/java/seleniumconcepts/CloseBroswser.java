package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseBroswser {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://gmail.com/");	

		driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts?hl=ro']")).click();

		Thread.sleep(5000);

		//driver.close(); //closes only the focused current tab, controlled by the driver

		driver.quit(); //closes all tabs
		//only a comment from github2
	}

}
