package com.loop.test.day10_upload_download;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_Task2 {

    /**
     * logins to the loopcamp practice application
     * tests:click and hold small circle,move to Big circle and validate text "Now drop..."
     */
        @Test (priority = 1)
        public void dragAndDrop1() {
            Driver.getDriver().get(ConfigurationReader.getProperty("loopcamp.drag"));
            WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
            WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div [contains(@id,'droptarget')]"));
            Actions action = new Actions(Driver.getDriver());
            action.clickAndHold(smallCircle).moveToElement(bigCircle).perform();
            String expected = "Now drop...";
            String actual = bigCircle.getText();
            Assert.assertEquals(actual, expected, "TEST FAIL--> Actual does not meet expected");
        }

    /**
     * logins to the loopcamp practice application
     * tests:click and hold small circle,move outside Big circle and validate text "Try again..."
     */
    @Test (priority = 2)
        public void dragAndDrop2 () {
        Driver.getDriver().get(ConfigurationReader.getProperty("loopcamp.drag"));
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div [contains(@id,'droptarget')]"));
        WebElement outsideCircle = Driver.getDriver().findElement(By.xpath("//div[@class='container']"));
        Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(smallCircle,outsideCircle).perform();
        String expected = "Try again!";
        String actual = bigCircle.getText();
        Assert.assertEquals(actual, expected, "TEST FAIL--> Actual does not meet expected");

        }
    }

