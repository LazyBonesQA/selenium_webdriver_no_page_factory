package framework.d_explicit_wait_are_versatile;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;


/**
 * Created by Admin on 05.03.2017.
 */
public class GoogleTest {

    static  WebDriver driver;

    @BeforeClass
    public static void setSystemPropertyForDriver(){
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
    }

    @Test
    public void testSerarchText(){
        driver = new ChromeDriver();
        driver.get("http://google.com/ncr");

        driver.findElement(By.id("lst-ib")).sendKeys("Selenium", Keys.ENTER);
        (new WebDriverWait(driver, 3)).
                until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".r a:nth-child(1)"),
                        "Selenium"));

        driver.findElement(By.id("lst-ib")).sendKeys(" chemical element", Keys.ENTER);
        (new WebDriverWait(driver, 3)).
                until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".r a:nth-child(1)"),
                        "Selenium - Wikipedia"));

    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}
