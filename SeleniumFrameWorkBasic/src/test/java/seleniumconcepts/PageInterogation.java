package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageInterogation {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://emag.ro/");

        String getTitle = driver.getTitle();

        System.out.println(getTitle);

        String getCurrentUrl = driver.getCurrentUrl();

        System.out.println(getCurrentUrl);

        Thread.sleep(5000);

        // Get the html code of the page

        String getSource = driver.getPageSource();

        System.out.println(getSource);

        driver.quit();

    }

}
