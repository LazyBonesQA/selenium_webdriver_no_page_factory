package framework.g_but_elements_as_lazy_method_works;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Admin on 05.03.2017.
 */
public class GoogleTest {

    static  WebDriver driver;

    public WebElement searchField(){
        return driver.findElement(By.id("lst-ib"));
    }

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
                until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".r a:nth-child(1)"),
                        "Selenium"));

        searchField().sendKeys(" chemical element", Keys.ENTER);
        (new WebDriverWait(driver, 3)).
                until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".r a:nth-child(1)"),
                        "Selenium - Wikipedia"));

    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}
