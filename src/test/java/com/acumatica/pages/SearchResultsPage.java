package com.wiley.pages;

import com.wiley.tech.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends PageObject {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".offer-content  a")
    public WebElement videoLink;
}