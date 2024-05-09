package com.loop.test.day12_practice;

import com.github.javafaker.Faker;
import com.loop.pages.SmartBearSoftware;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/*use testNG framework
        use page object model design

        task1
        1. Open browser
        2. Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        3. Enter username: “Tester”
        4. Enter password: “test”
        5. Click on Login button
        6. Click on Order
        7. Select familyAlbum from product, set quantity to 2
        8. Click to “Calculate” button
        9. Fill address Info with JavaFaker
        • Generate: name, street, city, state, zip code
        10.Click on “visa” radio button
        11.Generate card number using JavaFaker
        12.Click on “Process”
        13.Verify success message “New order has been successfully added.”

 */
public class Task01_FamilyAlbum {
    SmartBearSoftware smartBearSoftware;
    Actions action;
    Select dropdown;
    Faker faker;

    @BeforeMethod
    public void setUpMethod() {
        smartBearSoftware = new SmartBearSoftware();
        Driver.getDriver().get(ConfigurationReader.getProperty("smartBearsSoftware"));
        action = new Actions(Driver.getDriver());
    }
    @Test
    public void placing_order() {
        smartBearSoftware.username.sendKeys(ConfigurationReader.getProperty("smartsBear.username"));
        smartBearSoftware.password.sendKeys(ConfigurationReader.getProperty("smartsBear.login"));
        smartBearSoftware.loginButton.click();
        smartBearSoftware.order.click();
        dropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));
        dropdown.selectByValue("FamilyAlbum");

        smartBearSoftware.quantity.clear();
        smartBearSoftware.quantity.sendKeys("2");
        smartBearSoftware.quantity.click();
        smartBearSoftware.calculateButton.click();

        faker = new Faker();
        smartBearSoftware.customerName.sendKeys(faker.name().fullName());
        smartBearSoftware.street.sendKeys(faker.address().streetAddress());
        smartBearSoftware.city.sendKeys(faker.address().city());
        smartBearSoftware.state.sendKeys(faker.address().state());
        smartBearSoftware.zipCode.sendKeys(faker.address().zipCode());

        smartBearSoftware.cardType.click();
        smartBearSoftware.cardNumber.sendKeys(faker.numerify("###################"));
        smartBearSoftware.cardExpDate.sendKeys(faker.numerify("##/##"));

        smartBearSoftware.processButton.click();
        smartBearSoftware.successMessage.isDisplayed();
        assertEquals(smartBearSoftware.successMessage.getText(), "New order has been successfully added.", "TEST FAIL => ACTUAL DOES NOT MEET EXPECTED.");


    }
}
