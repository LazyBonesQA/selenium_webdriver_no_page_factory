package framework.l_hm_how_about_kicking_off_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Admin on 05.03.2017.
 */
public class BasePage extends ConciseAPI {
    public WebDriver driver;

    public WebDriver getWebDriver() {

        return driver;
    }

    public BasePage(WebDriver d){
        this.driver = d;
        PageFactory.initElements(d, this);
    }


}
