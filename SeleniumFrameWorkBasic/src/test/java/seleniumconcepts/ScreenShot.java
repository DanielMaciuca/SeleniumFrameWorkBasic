package seleniumconcepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		File fileSource =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //take the screenshot

		//import commons-io in order to save/view the screenshot
		//screenshot folder is automatically created
		FileUtils.copyFile(fileSource, new File("./screenshots/screen.png"));


	}

}
