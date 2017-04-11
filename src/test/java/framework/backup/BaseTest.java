package framework.backup;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Admin on 05.03.2017.
 */
public class BaseTest extends ConciseAPI {

    public WebDriver driver;

    @Before
    public void setSystemPropertyForDriver(){
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        getWebDriver().quit();
    }

    public WebDriver getWebDriver() {
        return driver;
    }
}
