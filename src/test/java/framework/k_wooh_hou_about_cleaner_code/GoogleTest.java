package framework.k_wooh_hou_about_cleaner_code;


import org.junit.Test;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;


public class GoogleTest extends BaseTest{



    @Test
    public void testSerarchText(){

        open("http://google.com/ncr");
        GooglePage page = new GooglePage(getWebDriver());


        page.searchMore("Selenium");
        assertThat(textToBePresentInElement(page.firstResult,
                        "Selenium - Web Browser Automation"));

        page.searchMore(" chemical element");
        assertThat(textToBePresentInElement(page.firstResult,
                        "Selenium - Wikipedia"));
    }

}
