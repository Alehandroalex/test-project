package com.wiley.blocks;

import com.wiley.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class TopMenuFrame extends MainPage {

    public TopMenuFrame(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-top__item:nth-of-type(1) .col-xs-7 .nav-top-submenu__list > li > a.nav-top-submenu__link")
    public List<WebElement> productFrameItems;

    public WebElement getDistribution() {
        return (new WebDriverWait(driver, 15)).until(presenceOfElementLocated(By.linkText(
                "Distribution")));
    }
}