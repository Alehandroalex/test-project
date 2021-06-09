package com.wiley.blocks;

import com.wiley.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuBlock extends MainPage {

    public TopMenuBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-top__item:nth-of-type(1)")
    public WebElement products;

    @FindBy(css = ".nav-top__item:nth-of-type(2)")
    public WebElement industries;
}