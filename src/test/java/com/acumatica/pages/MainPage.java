package com.wiley.pages;

import com.wiley.tech.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class MainPage extends PageObject {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".search-main__trigger")
    public WebElement searchButton;

    @FindBy(id = "search-main-field")
    public WebElement searchField;

    @FindBy(css = ".nav-top__item > a")
    public List<WebElement> topMenuElementsList;

    public WebElement isDisplayedTopMenuFrame() {
        return (new WebDriverWait(driver, 15)).until(visibilityOfElementLocated(By.className(
                "nav-top-submenu")));
    }

    public WebElement getDistribution() {
        return (new WebDriverWait(driver, 15)).until(visibilityOfElementLocated(By.cssSelector(
                ".navigation-menu-items .dropdown-submenu:nth-of-type(2)")));
    }
}