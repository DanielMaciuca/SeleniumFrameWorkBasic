package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Trys {

    @Test

    public void firstMethod(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.emag.ro/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        By element = By.id("searchboxTrigger");

        driver.findElement(element).sendKeys("first portocala");

    }

    @Test
    public void secondMethod(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.emag.ro/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        By element = By.id("searchboxTrigger");

        driver.findElement(element).sendKeys("second portocala");

    }
}
