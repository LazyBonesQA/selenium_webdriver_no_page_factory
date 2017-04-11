package framework.i_here_comes_pagefactory_to_solve_both_with_proxy_webelements;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;


/**
 * Created by Admin on 05.03.2017.
 */
public class GoogleTest {

    static WebDriver driver;
    static GooglePage page;


    @BeforeClass
    public static void setSystemPropertyForDriver(){
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");

    }

    @Test
    public void testSerarchText(){

        driver = new ChromeDriver();
        driver.get("http://google.com/ncr");
        page = new GooglePage(driver);

        page.searchField.sendKeys("Selenium", Keys.ENTER);
        (new WebDriverWait(driver, 3)).
                until(textToBePresentInElement(page.firstResult,
                        "Selenium"));

        page.searchField.sendKeys(" chemical element", Keys.ENTER);
        (new WebDriverWait(driver, 3)).
                until(textToBePresentInElement(page.firstResult,
                        "Selenium - Wikipedia"));
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
