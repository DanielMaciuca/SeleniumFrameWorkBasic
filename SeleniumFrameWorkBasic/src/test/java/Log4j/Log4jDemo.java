package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4jDemo {

	static Logger logger = LogManager.getFormatterLogger(Log4jDemo.class);

	@Test

	public void method() {

		System.out.println("Only a static method");

		logger.info("This is info message");
		logger.error("This is an error message");
		logger.warn("This is a warning");
		logger.fatal("This is a fatal error");
	}
}
