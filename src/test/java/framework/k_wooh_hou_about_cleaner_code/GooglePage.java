package framework.k_wooh_hou_about_cleaner_code;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Admin on 05.03.2017.
 */
public class GooglePage extends BasePage{


    @FindBy(css = ".r a:nth-child(1)")
    public WebElement firstResult;

    public GooglePage(WebDriver d) {
        super(d);
    }


    public void searchMore(String text){
        $(By.id("lst-ib")).sendKeys(text, Keys.ENTER);

    }


}
