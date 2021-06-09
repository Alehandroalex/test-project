package com.wiley.steps;

import com.wiley.blocks.TopMenuBlock;
import com.wiley.blocks.TopMenuFrame;
import com.wiley.pages.DistributionPage;
import com.wiley.tech.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class CheckDistributionSection extends BaseTest {

    private final TopMenuBlock topMenuBlock;
    private final TopMenuFrame topMenuFrame;
    private final DistributionPage distributionPage;

    public CheckDistributionSection() {
        topMenuBlock = new TopMenuBlock(getDriver());
        topMenuFrame = new TopMenuFrame(getDriver());
        distributionPage = new DistributionPage(getDriver());
    }

    public List<String> expectedListOnDistributionPage = new ArrayList<String>(asList("Financial Management",
            "Customer Relationship Management", "Reporting and Dashboards", "Inventory Management",
            "Business Intelligence", "Sales Order Management", "Purchase Order Management",
            "Service and Support Automation", "Requisition Management", "Customer Self-Service Portal"));

    @Test
    public void checkProductItems() {
        new Actions(getDriver()).moveToElement(topMenuBlock.industries).build().perform();
        topMenuFrame.getDistribution().click();

        List<String> productFrameItemsList = new ArrayList<String>();
        for (WebElement element : distributionPage.functionalityForDistributorsElementsList) {
            productFrameItemsList.add(element.getText());
        }
        assertEquals(productFrameItemsList, expectedListOnDistributionPage);
    }
}