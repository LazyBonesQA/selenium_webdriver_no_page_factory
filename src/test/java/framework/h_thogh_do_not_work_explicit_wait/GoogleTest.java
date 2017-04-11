package framework.h_thogh_do_not_work_explicit_wait;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;


/**
 * Created by Admin on 05.03.2017.
 */
public class GoogleTest {

    static  WebDriver driver;

    public WebElement searchField(){
        return driver.findElement(By.id("lst-ib"));
    }
    public WebElement firstResult() { return driver.findElement(By.cssSelector(".r a:nth-child(1)")); }

    WebElement firstResultCopy = firstResult();

    @BeforeClass
    public static void setSystemPropertyForDriver(){
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
    }

    @Test
    public void testSerarchText(){
        driver = new ChromeDriver();
        driver.get("http://google.com/ncr");

        searchField().sendKeys("Selenium", Keys.ENTER);
        (new WebDriverWait(driver, 3)).
                until(textToBePresentInElement(firstResult(), //wait elementProxy
                        "Selenium"));

        searchField().sendKeys(" chemical element", Keys.ENTER);
        (new WebDriverWait(driver, 3)).
                until(textToBePresentInElement(firstResult(), //wait elementProxy
                        "Selenium - Wikipedia"));
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
