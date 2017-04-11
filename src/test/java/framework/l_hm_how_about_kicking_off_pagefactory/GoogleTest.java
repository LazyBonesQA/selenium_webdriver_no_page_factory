package framework.l_hm_how_about_kicking_off_pagefactory;


import org.junit.Test;


import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class GoogleTest extends BaseTest {



    @Test
    public void testSerarchText(){

        open("http://google.com/ncr");
        GooglePage page = new GooglePage(getWebDriver());

        page.searchMore("Selenium");

        assertThat(textToBePresentInElementLocated(page.firstResult,
                        "Selenium - Web Browser Automation"));


        page.searchMore(" chemical element");

        assertThat(textToBePresentInElementLocated(page.firstResult,
                        "Selenium - Wikipedia"));
    }

    @Test
    public void followFirstResult(){
        open("http://google.com/ncr");
        GooglePage page = new GooglePage(getWebDriver());

        page.searchMore("Selenium");
        page.followFirstResult();
        assertThat(titleIs("Selenium - Web Browser Automation"));

    }
}
