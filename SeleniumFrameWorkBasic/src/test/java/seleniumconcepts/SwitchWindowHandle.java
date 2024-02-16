package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindowHandle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://gmail.com/");

        // Perform the click operation that opens new window

        driver.findElement(By.xpath("//a[contains(@href, 'https://support.google.com/accounts')]")).click();

        //Store the current window handle

        String winHandleBefore = driver.getWindowHandle();

        // Switch to new window opened

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            System.out.println(winHandle);
        }

        // Perform the actions on new window

        driver.findElement(By.xpath("//input[@class='promoted-search__input']")).sendKeys("test");

        // Close the new window, if that window no more required
        //driver.close();

        // Switch back to original browser (first window)
        driver.switchTo().window(winHandleBefore);

        driver.findElement(By.id("identifierId")).sendKeys("test2");

        // Continue with original browser (first window)

    }

}
