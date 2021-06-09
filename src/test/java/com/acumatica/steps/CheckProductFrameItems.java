package com.wiley.steps;

import com.wiley.blocks.TopMenuBlock;
import com.wiley.blocks.TopMenuFrame;
import com.wiley.pages.MainPage;
import com.wiley.tech.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class CheckProductFrameItems extends BaseTest {

    private final MainPage mainPage;
    private final TopMenuBlock topMenuBlock;
    private final TopMenuFrame topMenuFrame;

    public CheckProductFrameItems() {
        mainPage = new MainPage(getDriver());
        topMenuBlock = new TopMenuBlock(getDriver());
        topMenuFrame = new TopMenuFrame(getDriver());
    }

    private final List<String> expectedProductFrameItems = new ArrayList<String>(asList("General Business Edition",
            "Distribution Edition", "Manufacturing Edition", "Construction Edition", "Retail-Commerce Edition"));

    @Test
    public void checkProductFrameItems() {

        new Actions(getDriver()).moveToElement(topMenuBlock.products).build().perform();
        mainPage.isDisplayedTopMenuFrame();

        List<String> productFrameItemsList = new ArrayList<String>();
        for (WebElement element : topMenuFrame.productFrameItems) {
            productFrameItemsList.add(element.getText());
        }
        assertEquals(productFrameItemsList, expectedProductFrameItems);
    }
}