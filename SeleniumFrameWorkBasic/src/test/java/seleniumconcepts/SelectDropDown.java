package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class SelectDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.amazon.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));


		WebElement element = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

		Select dropdown = new Select(element);

		//dropdown.selectByIndex(3);

		dropdown.selectByValue("search-alias=baby-products-intl-ship"); 

		//dropdown.selectByVisibleText("Baby");

		//dropdown.deselectByIndex(1);
		//dropdown.deselectByValue("search-alias=baby-products-intl-ship");
		dropdown.deselectByVisibleText("Baby");

	}

}
