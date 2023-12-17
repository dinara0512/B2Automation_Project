package com.loop.test.day6_alerts_iframes.base;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;


public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod () {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod () {
        driver.quit();
    }
}
