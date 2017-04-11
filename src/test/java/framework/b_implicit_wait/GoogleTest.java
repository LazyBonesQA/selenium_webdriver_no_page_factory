package framework.b_implicit_wait;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


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
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // No waiting will crying
        driver.get("http://google.com/ncr");
        driver.findElement(By.id("lst-ib")).sendKeys("Selenium", Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.cssSelector(".r a:nth-child(1)")).getText().contains("Selenium"));
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}
