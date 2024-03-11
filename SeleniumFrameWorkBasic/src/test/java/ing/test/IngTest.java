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
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://ing.ro/persoane-fizice/curs-valutar");
        driver.manage().window().maximize();

        WebElement action = driver.findElement(By.id("exchange-type"));

        Select firstDropdown = new Select(action);

        firstDropdown.selectByValue("1");

        WebElement amount = driver.findElement(By.xpath("//input[@type='number']"));

        amount.clear();

        amount.sendKeys("30");

        Thread.sleep(3000);

//        System.out.println(amount.getText());

        System.out.println(amount.getAttribute("value"));


//        amount.getAttribute("amount");
//        WebElement label = driver.findElement(By.xpath("//label[contains(text(), 'Vreau')]"));
//        System.out.println(label.getText());


        WebElement currency = driver.findElement(By.id("exchange-visa-trans"));

        Select currencyDropDown = new Select(currency);

        currency.sendKeys("USD");

        System.out.println(currencyDropDown.getFirstSelectedOption().getText());

        WebElement expectedResult = driver.findElement(By.xpath("//span[@class='exchange-visa-total']"));

//        By expectedResult = By.xpath("//span[@class='exchange-visa-total']");
//
//        driver.findElement(expectedResult).getText();

        expectedResult.getText();

        double expectedResultParsing = Double.parseDouble(expectedResult.getText());

//        System.out.println(driver.findElement(expectedResult).getText());

        // parsing value




        WebElement tableAmount = driver.findElement(By.xpath("(//table//tr[2]//td[6])[1]"));

        tableAmount.getText();

        System.out.println(tableAmount.getText());


        // Actual Result

        // validation

        double parsedAmount = Double.parseDouble(amount.getAttribute("value"));

        double parseTableAmount = Double.parseDouble(tableAmount.getText());

        double finalResult = parsedAmount * parseTableAmount;

        System.out.println(finalResult);

        // rounding result

        Assert.assertEquals(finalResult,expectedResultParsing);

//        driver.quit();
    }
}
