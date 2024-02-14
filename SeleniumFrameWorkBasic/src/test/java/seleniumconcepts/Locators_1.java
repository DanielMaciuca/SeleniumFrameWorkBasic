package seleniumconcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators_1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.emag.ro/");

        // By.ID

        // driver.findElement(By.id("searchboxTrigger")).click();

        // By.NAME

        // driver.findElement(By.name("query")).click();

        // driver.findElement(By.name("query")).click();

        // By.CLASS

         driver.manage().window().maximize();

        // driver.findElement(By.className("caret")).click();

        //By.TAGNAME - Verifying the number of links from a page

       // driver.findElement(By.tagName("img")).click();

        // By.LINKTEXT

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //driver.findElement(By.linkText("Genius Deals")).click();

        //By.PARTIALLINKTEXT

        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //driver.findElement(By.partialLinkText("Genius")).click();


    }

}
