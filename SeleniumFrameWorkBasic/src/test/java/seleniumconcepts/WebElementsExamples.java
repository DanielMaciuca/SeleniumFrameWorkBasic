package seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class WebElementsExamples {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.emag.ro");
        driver.manage().window().maximize();

        // EXAMPLE 1

        // Logical steps

        // Returns the locator strategy -> I am saying: I want to identify an element using xpath
        //By.xpath("//a[@href='/user/login']")

        // Find the WebElement using driver.findElement() method
        // driver.findElement() method returns an WebElement, therefore you can interact with it: click(), sendKeys(), etc

        //driver.findElement(By.xpath("//a[@href='/user/login']")).click();

        // Assign the found WebElement to a variable in order to make things easier

//        WebElement contulMeu = driver.findElement(By.xpath("//a[@href='/user/login']"));
//        contulMeu.click();
//

        // EXAMPLE 2 -> This approach makes the code more modular

//        By contulMeu = By.xpath("//a[@href='/user/login']");
//
//        driver.findElement(contulMeu).click();

//        EXAMPLE 3 -> Other actions: sendKeys, clear

        WebElement searchBox = driver.findElement(By.id("searchboxTrigger"));
        searchBox.sendKeys("portocala");
        Thread.sleep(3000);
        searchBox.clear();

//        EXAMPLE 4 -> Get text

        WebElement login = driver.findElement(By.xpath("//a[@href='/user/login']"));
        String resultText = login.getText();
        System.out.println(resultText);
        driver.quit();
        
    }
}
