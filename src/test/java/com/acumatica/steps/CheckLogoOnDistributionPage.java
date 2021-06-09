package com.wiley.steps;

import com.wiley.blocks.TopMenuBlock;
import com.wiley.blocks.TopMenuFrame;
import com.wiley.pages.DistributionPage;
import com.wiley.tech.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertTrue;

public class CheckLogoOnDistributionPage extends BaseTest {

    private final TopMenuBlock topMenuBlock;
    private final TopMenuFrame topMenuFrame;
    private final DistributionPage distributionPage;

    public CheckLogoOnDistributionPage() {
        topMenuBlock = new TopMenuBlock(getDriver());
        topMenuFrame = new TopMenuFrame(getDriver());
        distributionPage = new DistributionPage(getDriver());
    }

    @Test
    public void checkLogoOnDistributionPage() {

        new Actions(getDriver()).moveToElement(topMenuBlock.industries).build().perform();
        topMenuFrame.getDistribution().click();

        for (WebElement element : distributionPage.logosElementsList) {
            assertTrue(element.getAttribute("src").endsWith(".svg"));
        }
    }
}