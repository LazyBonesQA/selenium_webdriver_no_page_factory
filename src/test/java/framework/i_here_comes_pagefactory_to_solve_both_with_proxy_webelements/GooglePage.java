package framework.i_here_comes_pagefactory_to_solve_both_with_proxy_webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Admin on 05.03.2017.
 */
public class GooglePage {
        @FindBy(id = "lst-ib")
        public WebElement searchField;

        @FindBy(css = ".r a:nth-child(1)")
        public WebElement firstResult;

    public GooglePage(WebDriver d){
        PageFactory.initElements(d, this);
    }

}
