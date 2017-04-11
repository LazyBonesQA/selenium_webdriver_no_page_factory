package framework.k_wooh_hou_about_cleaner_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Admin on 05.03.2017.
 */
public abstract class ConciseAPI {

    public abstract WebDriver getWebDriver ();

    public void assertThat(ExpectedCondition<Boolean> condition) {
        new WebDriverWait(getWebDriver(), 4).until(condition);
    }

    public WebElement $(By locator){
        return getWebDriver().findElement(locator);
    }

    public WebElement $(String sscLocator){
        return getWebDriver().findElement(By.cssSelector(sscLocator));
    }

    public void open(String url){
       getWebDriver().get(url);
    }
}
