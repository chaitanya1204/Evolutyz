package cleartrip.com.evolutyz;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class StepDefinition {

    WebDriver driver;

    @Given("I open flight booking website")
    public void i_open_flight_booking_website() {
        System.out.println("welcome");

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.cleartrip.com/");

    }

    @Given("I book ticket from {string} to {string}")
    public void i_book_ticket_from_to(String fromCity, String toCity) throws Throwable {
        System.out.println("hello");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("FromTag")).click();
        // driver.findElement(By.id("ui-id-12")).click();
        driver.findElement(By.id("FromTag")).clear();
        driver.findElement(By.id("FromTag")).sendKeys(fromCity);
        driver.findElement(By.id("ToTag")).click();
        // driver.findElement(By.id("ui-id-18")).click();
        driver.findElement(By.id("ToTag")).clear();
        driver.findElement(By.id("ToTag")).sendKeys(toCity);
        driver.findElement(By.xpath("//*[@id=\"ORtrip\"]/section[2]/div[1]//i[@class='icon ir datePicker']")).click();
        driver.findElement(By.linkText("24")).click();
        driver.findElement(By.id("Adults")).click();
        new Select(driver.findElement(By.id("Adults"))).selectByVisibleText("2");
        driver.findElement(By.id("Adults")).click();
        driver.findElement(By.id("Childrens")).click();
        new Select(driver.findElement(By.id("Childrens"))).selectByVisibleText("1");
        driver.findElement(By.id("Childrens")).click();
        driver.findElement(By.id("Infants")).click();
        new Select(driver.findElement(By.id("Infants"))).selectByVisibleText("1");
        driver.findElement(By.id("Infants")).click();
        driver.findElement(By.id("SearchBtn")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Duration")).click();
        driver.findElement(By.xpath("(//button[text()='Book'])[1]")).click();

    }

}
