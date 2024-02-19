package seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class FluentWaitExample {

    public static void main(String[] args) {

        //You can specify the pooling interval

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2\r\n" + "");

        driver.findElement(By.xpath("//button")).click();

        // Waiting 30 seconds for an element to be present on the page, checking
        // for its presence once every 5 seconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5L))
                .pollingEvery(Duration.ofSeconds(1L))
                .ignoring(NoSuchElementException.class);

        // In this case will search for the first element, and after is found will search for the second element.
        // If the first element is found in 3 seconds and the second element is found in 4 seconds the total is 7 seconds and the wait will fail 7 > 5;

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"finish\"]/h4")));

//      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("another element")));

        System.out.println(driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).isDisplayed());

//        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));
//            }
//        });

        driver.quit();
    }
}