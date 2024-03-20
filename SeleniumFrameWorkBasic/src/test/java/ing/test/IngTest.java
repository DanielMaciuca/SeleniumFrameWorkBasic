package ing.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class IngTest {

    @Test
    public static void myMethod() throws InterruptedException {

        // WebDriver initialization

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://ing.ro/persoane-fizice/curs-valutar");
        driver.manage().window().maximize();

        // Operation DropDown

        By actionLocator = By.id("exchange-type");

        WebElement actionLocatorElement = driver.findElement(actionLocator);

        Select firstDropdownElement = new Select(actionLocatorElement);

        firstDropdownElement.selectByValue("1");

        // Ammount DropDown

        By amountLocator = By.xpath("//input[@type='number']");

        WebElement amountInputElement = driver.findElement(amountLocator);

        amountInputElement.clear();

        amountInputElement.sendKeys("30");

        Thread.sleep(3000);

        System.out.println(amountInputElement.getAttribute("value"));

        // Currency DropDown

        By currencyLocator = By.id("exchange-visa-trans");

        WebElement currencyElement = driver.findElement(currencyLocator);

        Select currencyDropDown = new Select(currencyElement);

        currencyDropDown.selectByVisibleText("USD");

        System.out.println(currencyDropDown.getFirstSelectedOption().getText());

        // Find the TOTAL and parse it

        By expectedResultLocator = By.xpath("//span[@class='exchange-visa-total']");

        WebElement expectedResultElement = driver.findElement(expectedResultLocator);

        String expectedResultText = expectedResultElement.getText();

        double expectedResultParsing = Double.parseDouble(expectedResultText);

        System.out.println(expectedResultElement.getText());

        // Find the Element in Table and parse it

        WebElement tableAmount = driver.findElement(By.xpath("(//table//tr[2]//td[6])[1]"));

        tableAmount.getText();

        System.out.println(tableAmount.getText());

        // Make the calculations and parsing

        double parsedAmount = Double.parseDouble(amountInputElement.getAttribute("value"));

        double parseTableAmount = Double.parseDouble(tableAmount.getText());

        double finalResult = parsedAmount * parseTableAmount;

        System.out.println(finalResult);

        // Validation

        Assert.assertEquals(finalResult, expectedResultParsing);

         driver.quit();
    }
}
