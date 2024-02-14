package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseBroswserWindow {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://gmail.com/");

        driver.findElement(By.xpath("//a[contains(@href, 'https://support.google.com/accounts')]")).click();

        Thread.sleep(5000);

        //closes only the focused current tab, controlled by the driver
        driver.close();

        //closes all tabs
        //driver.quit();

    }

}
