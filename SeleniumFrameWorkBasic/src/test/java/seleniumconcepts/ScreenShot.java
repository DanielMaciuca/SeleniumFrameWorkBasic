package seleniumconcepts;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot{

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		//File fileSource =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //take the screenshot
		//import commons-io in order to save/view the screenshot
		//screenshot folder is automatically created

		//downcast the driver to access TakesScreenshot method
		TakesScreenshot screenshot = ((TakesScreenshot)driver);

		//capture screenshot as output type FILE
		File fileSource = screenshot.getScreenshotAs(OutputType.FILE);

		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

		//save the screenshot taken in destination path
		FileUtils.copyFile(fileSource, new File("./screenshots/"+ timeStamp + ".png" ));

		driver.close();

	}

}
