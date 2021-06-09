package com.wiley.steps;

import com.wiley.pages.MainPage;
import com.wiley.tech.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class CheckTopMenuItems extends BaseTest {

    private final MainPage mainPage;

    public CheckTopMenuItems() {
        mainPage = new MainPage(getDriver());
    }

    private final List<String> expectedTopMenuList = new ArrayList<String>(asList("PRODUCTS", "INDUSTRIES",
            "CUSTOMER STORIES", "MARKETPLACE", "SUPPORT", "MORE"));

    @Test
    public void checkTopMenuItems() {

        List<String> topMenuList = new ArrayList<String>();
        for (WebElement topMenuElement : mainPage.topMenuElementsList) {
            topMenuList.add(topMenuElement.getText());
        }
        assertEquals(expectedTopMenuList, topMenuList);
    }
}