package com.loop.test.day11_waits_pom;

import com.loop.pages.LoopPracticeDragAndDrop;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*redo these tasks with page object model pattern

        task1
        1. Open a chrome browser
        2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
        3. Click and hold small circle
        4. Move it on top of the big circle
        5. validate “Now drop…” text appears on big circ

        task2
        1. Open a chrome browser
        2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
        3. Click and hold small circle
        4. Dropped anywhere outside of big circle
        5. validate “Try again!” text appears on big circle

 */
public class Day10_Task1_Redo_POM {

    /**
     * logins to the loopcamp practice application
     * tests:click and hold small circle,move to Big circle and validate text "Now drop..."
     */
    LoopPracticeDragAndDrop loopPracticeDragAndDrop;
    Actions action;
    @BeforeMethod
    public void setUpMethod() {
        loopPracticeDragAndDrop = new LoopPracticeDragAndDrop();
        Driver.getDriver().get(ConfigurationReader.getProperty("loopcamp.drag"));
        action = new Actions(Driver.getDriver());
    }
    @Test
    public void dragAndDrop1() {
        action.clickAndHold(loopPracticeDragAndDrop.smallCircle).moveToElement(loopPracticeDragAndDrop.bigCircle).perform();
        Assert.assertEquals(loopPracticeDragAndDrop.bigCircle.getText(),loopPracticeDragAndDrop.expected, "TEST FAIL--> Actual does not meet expected");
    }
    @Test
    public void dragAndDrop2 () {
        action.dragAndDrop(loopPracticeDragAndDrop.smallCircle, loopPracticeDragAndDrop.outsideCircle).perform();
        Assert.assertEquals(loopPracticeDragAndDrop.bigCircle.getText(), loopPracticeDragAndDrop.expected2, "TEST FAIL--> Actual does not meet expected");
    }
}



