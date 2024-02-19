package seleniumconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2\r\n" + "");

        driver.findElement(By.xpath("//button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"finish\"]/h4")));

//        System.out.println(driver.getTitle());
//
//        wait.until(ExpectedConditions.titleContains("The Internet"));


        System.out.println("Element displayed");

        System.out.println(driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).isDisplayed());

    }

}
