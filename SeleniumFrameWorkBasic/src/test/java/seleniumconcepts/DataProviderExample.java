package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample {

	@Test(dataProvider="test1")
	public  void test(String username, String password) {

		WebDriverManager.chromedriver().setup();			
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		driver.findElement(By.linkText("Sign up now")).click();

		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(password);
		
	}

	@DataProvider(name = "test1")

	public Object[][] myDataSet() {

		return new Object[][] 
		{
			{"test1", "test@test1"},
			{"test2", "test@test2"},
			{"test3", "test@test3"},

		};

		

	}

}
