package seleniumconcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageInterogation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://gmail.com/");	

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		//System.out.println(driver.getPageSource());

		driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts?hl=ro']")).click();

		Thread.sleep(5000);

		//driver.close(); //only current tab

		driver.quit(); //all tabs

	}

}
