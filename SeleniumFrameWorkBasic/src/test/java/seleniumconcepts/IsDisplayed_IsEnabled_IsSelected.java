package seleniumconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayed_IsEnabled_IsSelected {

	public static void main(String[] args) {

		//1. isDisplayed(): method is used to verify whether any object on a site is present or not.
		//So, it’s applicable to any web object and returned true or false.

		//2. isEnabled(): used to confirm whether an element is Enable or disable -> if you can interact (click, type) with the element or not
		//If enabled, it would return ‘true’ otherwise ‘false’.

		//3. isSelected(): method is only applicable for checkbox, drop-down, radio button on a site. it will also return true or false.

		WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

		driver.get("https://us.megabus.com/account-management/login");	

		driver.manage().window().maximize();

		WebElement Signup = driver.findElement(By.xpath("//a[@class='btn btn-link btn-block'][contains(text(),'Sign up')]"));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(Signup));

		Signup.click();

		//is displayed
		WebElement mySignup = driver.findElement(By.xpath("//button[@id='signup']"));
		System.out.println(mySignup.isDisplayed());

		//is enabled
		System.out.println(mySignup.isEnabled());

		WebElement myCheckbox=driver.findElement(By.xpath("//input[@id='termsAndPrivacy']"));
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOf(myCheckbox));
		new Actions(driver).moveToElement(myCheckbox, 1, 1).click().perform();

		//is selected
		System.out.println(myCheckbox.isSelected());

	}

}
