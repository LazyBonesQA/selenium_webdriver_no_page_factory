package framework.l_hm_how_about_kicking_off_pagefactory;

import org.openqa.selenium.*;


/**
 * Created by Admin on 05.03.2017.
 */
public class GooglePage extends BasePage {


    By firstResult = by(".r a:nth-child(1)");

    public GooglePage(WebDriver d) {
        super(d);
    }


    public void searchMore(String text){
       $(By.id("lst-ib")).sendKeys(text, Keys.ENTER);
    }
    public void search(String text){
        $(By.id("lst-ib")).clear();
        $(By.id("lst-ib")).sendKeys(text, Keys.ENTER);
    }

    public void followFirstResult(){
        $(firstResult).click();
    }


}
