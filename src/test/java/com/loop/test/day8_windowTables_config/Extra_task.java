package com.loop.test.day8_windowTables_config;

import com.loop.test.day6_alerts_iframes.base.TestBase;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class Extra_task extends TestBase {

 //   private static final By DOCUPORT_LOGO = By.xpath("//img[@src='/img/logo.d7557277.svg']");




    @Test
    public void docuport_creation() throws InterruptedException{
        driver.get(" https://app.docuport.app/company-formation/resident");
        WebElement logo = driver.findElement(By.xpath("//img[@alt = 'Docuport']"));
//        String expected = "Docuport";
//        String actual = logo.getText();
//        Assert.assertEquals(actual, expected, "Actual does not match the expected");

WebElement llcRegistartion = driver.findElement(By.xpath("text-h6 gray--text text--darken-3"));
String expected = "LLC Registration";
String actual = llcRegistartion.getText();
Assert.assertEquals(actual,expected,"Actual Does NOT meet expectiation, TEST FAILED");
        WebElement typeOfBusiness = driver.findElement(By.xpath("(//*[@class='v-input--selection-controls__ripple primary--text'])[1]"));
        typeOfBusiness.click();
       // Thread.sleep(3000);
        System.out.println(typeOfBusiness.isSelected() + " before clicking");


        WebElement stateOfFormation = driver.findElement(By.xpath("//label[.='Washington D.C.']/preceding-sibling::div/input"));
        stateOfFormation.click();
       // Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//label[.='Washington D.C.']/preceding-sibling::div/input"));
        System.out.println(element.isSelected() + " after clicking ");


        //label[text()='Washington D.C.']

//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.get("https://loopcamp.vercel.app/radio-buttons.html");
//        // wait the whole page loads - selenium 3
//        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        // wait the whole page load - selenium 4
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebElement red = driver.findElement(By.xpath("//input[@id='red']"));
//        WebElement green = driver.findElement(By.xpath("//input[@id='green']"));
//
//        // isSelected()
//
//        System.out.println(red.isSelected() + " before clicking");
//        red.click();
//        Thread.sleep(5000);
//        System.out.println(red.isSelected() + " after clicking");
//        green.click();
//
//        // isEnabled
//        System.out.println(red.isEnabled() + " checking if enabled");
//        System.out.println(green.isEnabled() + " checking if enabled");
    }
}
