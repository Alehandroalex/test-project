package com.wiley.tech;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    private static WebDriver driver;

    protected WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", BaseTest.class.getResource("../chromedriver.exe").getFile());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.acumatica.com/");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}