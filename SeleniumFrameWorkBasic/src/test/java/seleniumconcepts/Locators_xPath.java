package seleniumconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_xPath {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		//Relative Path

		//Absolute Path

		//Attribute Selection

		//Xpath =//tagname[@Attribute='value'] - SYNTAX

		//FIRST EXAMPLE

		//driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("test");

		//CONTAINS -> A HREF

		//driver.findElement(By.xpath("//a[contains(@href,'/gp/goldbox?ref_=nav_cs_gb\')]")).click();

		// FUCTION -> LONG A HREF

		//driver.findElement(By.xpath("//a[text()='About Amazon']")).click();

		//DIFFERENT EXAMPLES

		//driver.findElement(By.xpath("//span[@id= 'nav-link-accountList-nav-line-1']")).click();

		//driver.findElement(By.xpath("//a[@class'nav-a']")).click();

		//WebElement element = driver.findElement(By.xpath("//span[@id= 'nav-link-accountList-nav-line-1']"));

		//element.click();

		driver.findElement(By.xpath("//a[@id=\"nav-cart\"]")).click();




	}

}
