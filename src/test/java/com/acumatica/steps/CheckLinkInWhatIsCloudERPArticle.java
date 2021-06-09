package com.wiley.steps;

import com.wiley.blocks.SearchResultsBlock;
import com.wiley.pages.MainPage;
import com.wiley.pages.SearchResultsPage;
import com.wiley.tech.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckLinkInWhatIsCloudERPArticle extends BaseTest {
    private final MainPage mainPage;
    private final SearchResultsBlock searchResultsBlock;
    private final SearchResultsPage searchResultsPage;

    public CheckLinkInWhatIsCloudERPArticle() {
        mainPage = new MainPage(getDriver());
        searchResultsBlock = new SearchResultsBlock(getDriver());
        searchResultsPage = new SearchResultsPage(getDriver());
    }

    @Test
    public void checkLinkInWhatIsCloudERPArticle() {

        mainPage.searchButton.click();
        mainPage.searchField.sendKeys("cloud");
        searchResultsBlock.waitForSearchLoading();
        searchResultsBlock.getSearchResult("What is Cloud ERP").click();
        assertTrue(searchResultsPage.videoLink.getAttribute("href").startsWith("https://fast.wistia.net"));
    }
}