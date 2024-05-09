package com.loop.test.day3_locators_css_xpath.homework;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        //go to url
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");
        Thread.sleep(1000);

        //Enter username
        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys("b1g3_client@gmail.com");
        //Enter password
        WebElement enterPassword = driver.findElement(By.id("input-15"));
        enterPassword.sendKeys(DocuportConstants.VALID_PASSWORD);
        //Login
        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();
        Thread.sleep(1000);

        if (driver.getCurrentUrl().contains(DocuportConstants.CLIENT_HOME_PAGE)){
            System.out.println("Client login is successful => TEST PASS");
        } else {
            System.out.println("Failed to login =>TEST FAIL");
        }

        //Continue
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[3]/div/button"));
        continueButton.click();
        Thread.sleep(1000);

        //Validation of successful login

        //Locating Logout button
        WebElement bgButton = driver.findElement(By.cssSelector("span[class='subtitle-2 text-none pl-2 pr-3 gray--text text--darken-3']"));
        bgButton.click();
        Thread.sleep(1000);

//        //Logging out
        WebElement logOut = driver.findElement(By.cssSelector("div[class=v-list-item__title]"));
        logOut.click();
        Thread.sleep(1000);

        //Validation of successful logout
        if (driver.getCurrentUrl().contains(DocuportConstants.DOCUPORT_PAGE)){
            System.out.println("Client logout is successful => TEST PASS");
        } else {
            System.out.println("Failed to logout =>TEST FAIL");
        }
        driver.close();

    }
}

