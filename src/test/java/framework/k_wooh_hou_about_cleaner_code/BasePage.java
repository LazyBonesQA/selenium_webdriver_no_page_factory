package framework.k_wooh_hou_about_cleaner_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Admin on 05.03.2017.
 */
public class BasePage extends ConciseAPI {
    private WebDriver driver;

    @Override
    public WebDriver getWebDriver() {
        return driver;
    }

    public BasePage(WebDriver d){
        this.driver = d;
        PageFactory.initElements(d, this);
    }


}
