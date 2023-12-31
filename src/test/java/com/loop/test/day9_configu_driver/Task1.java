package com.loop.test.day9_configu_driver;

import com.github.javafaker.Faker;
import com.loop.test.day6_alerts_iframes.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

/*
1. go to url: https://loopcamp.vercel.app/registration_form.html
2. fill the form
3. use faker
 */
public class Task1 extends TestBase {
    @Test
    public void fillOuttheForm() {
        driver.get("https://loopcamp.vercel.app/registration_form.html");
        Faker faker = new Faker();
        WebElement firstName = driver.findElement(By.xpath("//input [@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys(faker.name().username().replace(".",""));
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.internet().emailAddress());
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.numerify("###-###-####"));
        WebElement gender = driver.findElement(By.xpath("//input[@value='female']"));
        gender.click();
        System.out.println(gender.isSelected() + " after clicking ");
        WebElement dob = driver.findElement(By.xpath("//input[@name='birthday']"));
        SimpleDateFormat fakeDob = new SimpleDateFormat("MM/dd/yyyy");
        String DateOfBirth = fakeDob.format(faker.date().birthday(18,65));
        dob.sendKeys(DateOfBirth);
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='department']")));
        dropdown.selectByIndex(3);
        Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        dropdown2.selectByVisibleText("SDET");
        WebElement selectProgLang = driver.findElement(By.xpath("//label[contains(@for,'inlineCheckbox2')]"));
        selectProgLang.click();
        //System.out.println(selectProgLang.isSelected() + " after clicking ");
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit' and contains(text(),'Sign up')]"));
        submitButton.click();















    }
//    @Test
//    public void java_faker (){
//        Faker faker = new Faker ();
//    }
}
