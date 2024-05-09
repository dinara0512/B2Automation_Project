package com.loop.pages;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class SmartBearSoftware {
    public SmartBearSoftware() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='ctl00$MainContent$username']")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement loginButton;

    @FindBy(tagName = "a")
    public List<WebElement> lineList;

    @FindBy(xpath = "//a[@href='Process.aspx']")
    public WebElement order;
  
    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']")
    public WebElement quantity;

    @FindBy(xpath = "//input[@value='Calculate'] ")
    public WebElement calculateButton;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtName']")
    public WebElement customerName;

    @FindBy(xpath = " //input[@name='ctl00$MainContent$fmwOrder$TextBox2']")
    public WebElement street;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox3']")
    public WebElement city;

    @FindBy(xpath = "//input[@name ='ctl00$MainContent$fmwOrder$TextBox4']")
    public WebElement state;

    @FindBy(xpath = "//input[@name = 'ctl00$MainContent$fmwOrder$TextBox5']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement cardType;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox6']")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")
    public WebElement cardExpDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(xpath = "//div[@class='buttons_process']/strong")
    public WebElement successMessage;

}
