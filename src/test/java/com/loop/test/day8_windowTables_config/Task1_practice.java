package com.loop.test.day8_windowTables_config;

import com.loop.test.day6_alerts_iframes.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

/*
task1
=============
    1. login as an advisor
    2. go to users
    3. validate that full name for alex.de.souza@gmail.com is Alex De Souza     +
    4. validate that user name for alex.de.souza@gmail.com is alexdesouze       +
    5. validate that phone number for alex.de.souza@gmail.com is +994512060042
    6. validate that role for alex.de.souza@gmail.com is client
    7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
 */
public class Task1_practice extends TestBase {
    @Test
    public void test_webTables() throws InterruptedException {
        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        users.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String expectedFullName = "Alex De Souza";
        String actualFullName = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "Full name");
        //System.out.println("actualFullName = " + actualFullName);
        Assert.assertEquals(actualFullName, expectedFullName,"Actual does not match expected");

        String expectedUserName = "alexdesouze";
        String actualUserName = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com", "username");
        Assert.assertEquals(actualUserName,expectedUserName,"Actual does not match expected");

        String expectedUserNumber = "+994512060042";
        String actualUserNumber = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com", "phone number");
        Assert.assertEquals(actualUserNumber,expectedUserNumber,"Actual does not match expected");

        String expectedUserRole = "Client";
        String actualUserRole = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com", "role");
        Assert.assertEquals(actualUserRole,expectedUserRole,"Actual does not match expected");

        String expectedUserAdvisor = "Batch1 Group1";
        String actualUserAdvisor = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com", "advisor");
        Assert.assertEquals(actualUserAdvisor,expectedUserAdvisor,"Actual does not match expected");

    }
}
