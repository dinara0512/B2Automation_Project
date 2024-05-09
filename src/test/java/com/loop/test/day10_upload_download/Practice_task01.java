package com.loop.test.day10_upload_download;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

/*
task1
1. Open a chrome browser
2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
3. Click and hold small circle
4. Move it on top of the big circle
5. validate “Now drop…” text appears on big circ
 */
public class Practice_task01 {
    WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
    WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div [contains(@id,'droptarget')]"));
//    By smallCircle = By.xpath("//div[@id='draggable']");
//    By bigCircle = By.xpath("//div [contains(@id,'droptarget')]");

    /**
     * logins to the loopcamp practice application
     * tests:click and hold small circle,move to Big circle and validate text
     */

    @Test
    public void dragAndDrop1() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loopcamp.drag"));
//        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
//        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div [contains(@id,'droptarget')]"));
        Actions action = new Actions(Driver.getDriver());
        action.clickAndHold(smallCircle).moveToElement(bigCircle).perform();
        String expected = "Now drop...";
        String actual = bigCircle.getText();
        Assert.assertEquals(actual, expected, "TEST FAIL--> Actual does not meet expected");

    }
}

//@BeforeTest
//public void setUpMethod () {
//    Driver.getDriver().get(ConfigurationReader.getProperty("loopcamp.drag"));
//  }
//
//    @AfterMethod
//    public void tearDownMethod () {
//       Driver.getDriver().quit();
//    }
//}
