package utils;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public static void LaunchBrowser() {

		String Browser = "chrome";

		if(Browser.equalsIgnoreCase("chrome")){

			WebDriverManager.chromedriver().setup();

		}

		else if(Browser.equalsIgnoreCase("firefox")){

			WebDriverManager.firefoxdriver().setup();

		}

		else if(Browser.equalsIgnoreCase("edge")){

			WebDriverManager.edgedriver().setup();

		}
	}

}
