package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintAllLinks {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.emag.ro/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        int i = links.size();

        System.out.println(i);

        for (int j = 0; j < i; j++) { //Printing the links
            System.out.println(links.get(j).getText());
        }

        driver.close();

    }

}
