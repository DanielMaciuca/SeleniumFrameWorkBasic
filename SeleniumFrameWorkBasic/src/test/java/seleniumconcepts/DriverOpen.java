package seleniumconcepts;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverOpen {

    public static void main(String[] args) {


//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        WebDriver driver = new ChromeDriver(options);
//        driver.get("https://www.emag.ro");
//
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver1 = new FirefoxDriver();
//        driver1.get("https://www.emag.ro");

        WebDriverManager.edgedriver().setup();
        WebDriver driver2 = new EdgeDriver();
        driver2.get("https://www.emag.ro");

    }
}
