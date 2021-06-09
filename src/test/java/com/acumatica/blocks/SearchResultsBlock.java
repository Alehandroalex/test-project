package com.wiley.blocks;

import com.wiley.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class SearchResultsBlock extends MainPage {

    public SearchResultsBlock(WebDriver driver) {
        super(driver);
    }

    public void waitForSearchLoading() {
        new WebDriverWait(driver, 15).until(invisibilityOfElementLocated(By.partialLinkText("Loading...")));
    }

    public WebElement getSearchResult(String text) {
        return (new WebDriverWait(driver, 15)).until(presenceOfElementLocated(By.partialLinkText(text)));
    }
}