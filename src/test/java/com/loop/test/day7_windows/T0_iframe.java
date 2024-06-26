package com.loop.test.day7_windows;

import com.loop.test.day6_alerts_iframes.base.TestBase;
import com.loop.test.utilities.LoopCampConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T0_iframe extends TestBase {

    /*
    go to https://loopcamp.vercel.app/nested-frames.html
    validate "LEFT", "MIDDLE", "RIGHT", "BOTTOM"
     */

            @Test
            public void left(){
                driver.get("https://loopcamp.vercel.app/nested-frames.html");
                driver.switchTo().frame("frame-top");
                driver.switchTo().frame("frame-left");
                WebElement left = driver.findElement(By.xpath("//*[contains(text(),'LEFT')]"));
                String actualLeft = left.getText();
                Assert.assertEquals(actualLeft.trim(), "LEFT");
            }

            @Test
            public void right(){

            }

            @Test
            public void middle(){

            }

            @Test
            public void bottom(){

            }
        }
