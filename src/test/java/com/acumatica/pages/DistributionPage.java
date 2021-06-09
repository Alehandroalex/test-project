package com.wiley.pages;

import com.wiley.tech.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DistributionPage extends PageObject {

    public DistributionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".industry-functionality-section__list a")
    public List<WebElement> functionalityForDistributorsElementsList;

    @FindBy(css = "img[itemprop='logo']")
    public List<WebElement> logosElementsList;
}