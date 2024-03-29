package seleniumconcepts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowManage {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://emag.ro/");

        System.out.println(driver.manage().window().getSize()); //height and width

        System.out.println(driver.manage().window().getSize().getHeight());

        System.out.println(driver.manage().window().getSize().getWidth());

        driver.manage().window().maximize();

        driver.manage().window().fullscreen(); //title bar is not display anymore

        driver.manage().window().setSize(new Dimension(330, 330));

        driver.quit();

    }

}
