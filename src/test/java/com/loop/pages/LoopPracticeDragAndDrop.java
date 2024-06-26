package com.loop.pages;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopPracticeDragAndDrop {
    //    WebElement element = Driver.getDriver().findElement(By.id("id"));
    @FindBy(xpath = " //*[@id='draggable']")
    public WebElement smallCircle;

    @FindBy(id = "droptarget")
    public WebElement bigCircle;

    @FindBy(xpath = "//div[@class='container']")
    public WebElement outsideCircle;

    public String expected = "Now drop...";
    public String expected2 = "Try again!";
    public LoopPracticeDragAndDrop() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
