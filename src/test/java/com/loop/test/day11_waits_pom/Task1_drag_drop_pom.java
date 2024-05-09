package com.loop.test.day11_waits_pom;
/*
    Loop Practice Drag and Drop Test
    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. validate expected default text appears on big circle
    Expected = "Drag the small circle here."

    Loop Practice Drag and Drop Test
    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. validate "Drop here." text appears on big circle

    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Move it on top of the big circle
    5. validate “Now drop…” text appears on big circ

    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Dropped anywhere outside of big circle
    5. validate “Try again!” text appears on big circle
     */

import com.loop.pages.LoopPracticeDragAndDrop;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task1_drag_drop_pom {
    LoopPracticeDragAndDrop loopPracticeDragAndDrop;
    Actions action;
    @BeforeMethod

        public void setUpMethod(){
            Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
            loopPracticeDragAndDrop = new LoopPracticeDragAndDrop();
            action = new Actions(Driver.getDriver());
        }



    @Test
    public void drag_small_here_test(){
            String expected = "Drag the small circle here.";
            String actual = loopPracticeDragAndDrop.bigCircle.getText();
            assertEquals(actual, expected, "Actual does not match the expected");
        }

//        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
//        LoopPracticeDragAndDrop loopPracticeDragAndDrop = new LoopPracticeDragAndDrop();
//        String expected = "Drag the small circle here.";
//        String actual = loopPracticeDragAndDrop.bigCircle.getText();
//        assertEquals(actual,expected, "Actual does not match the expected");


    @Test
    public void drop_here () {
        action.moveToElement(loopPracticeDragAndDrop.smallCircle)
                .clickAndHold()
                .moveByOffset(100, 100)
                .pause(2000)
                .perform();
        assertEquals(loopPracticeDragAndDrop.bigCircle.getText(), "Drop here." );
//        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
//        LoopPracticeDragAndDrop loopPracticeDragAndDrop = new LoopPracticeDragAndDrop();
//        Actions action = new Actions(Driver.getDriver());
//        action.moveToElement(loopPracticeDragAndDrop.smallCircle)
//                .clickAndHold()
//                .moveByOffset(100,100)
//                .pause(2000)
//                .perform();
//        assertEquals(loopPracticeDragAndDrop.bigCircle.getText(),"Drop here.");

    }
}
