package com.loop.test.day11_waits_pom;

import com.beust.ah.A;
import com.loop.pages.SmartBearSoftware;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

/*task1
        1. Open browser
        2. Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        3. Enter username: “Tester”
        4. Enter password: “test”
        5. Click to Login button
        6. Print out count of all the links on landing page
        7. Print out each link text on this page
        /*


 */
public class Practice {

    SmartBearSoftware smartBearSoftware;
    Actions action;

    @BeforeMethod
    public void setUpMethod() {
        smartBearSoftware = new SmartBearSoftware();
        Driver.getDriver().get(ConfigurationReader.getProperty("smartBearsSoftware"));
        action = new Actions(Driver.getDriver());
    }

    @Override
    public String toString() {
        return "Practice{" +
                "smartBearSoftware=" + smartBearSoftware +
                ", action=";
    }

    @Test
    public void login() {
        smartBearSoftware.username.sendKeys(ConfigurationReader.getProperty("smartsBear.username"));
        smartBearSoftware.password.sendKeys(ConfigurationReader.getProperty("smartsBear.login"));
        smartBearSoftware.loginButton.click();
        System.out.println("Total amount of lines: " + smartBearSoftware.lineList.size());
        for (WebElement each: smartBearSoftware.lineList) {
            System.out.println("Link text: " + each.getText());
        }
    }
}