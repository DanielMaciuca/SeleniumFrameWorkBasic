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

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.sugarcrm.com/uk/request-demo/");

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement element = driver.findElement(By.id("how-select"));

        Select dropDown = new Select(element);

//		dropDown.selectByIndex(2);

//      dropDown.selectByValue("Event");

        dropDown.selectByVisibleText("Internet");

        //dropdown.deselectByIndex(1);
        //dropdown.deselectByValue("search-alias=baby-products-intl-ship");
//		dropdown.deselectByVisibleText("Baby");

    }

}
