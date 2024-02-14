package seleniumconcepts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigation {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

//        driver.get("https://www.emag.ro/");
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//
//        driver.navigate().refresh();
//
//		driver.close();
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.navigate().to("https://www.emag.ro/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.navigate().to("https://amazon.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.navigate().back();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.navigate().forward();

		driver.navigate().refresh();

		//Closes the tab in focus
		driver.close();

		//Closes all browser tabs
		//driver.quit();


    }

}
