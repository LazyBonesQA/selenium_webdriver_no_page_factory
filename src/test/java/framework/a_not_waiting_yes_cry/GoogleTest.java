package framework.a_not_waiting_yes_cry;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


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
        Assert.assertTrue(driver.findElement(By.cssSelector(".r a:nth-child(1)")).getText().contains("Selenium"));
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}
