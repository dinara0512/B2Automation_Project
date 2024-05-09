package com.loop.test.day8_windowTables_config;

import com.loop.test.day6_alerts_iframes.base.TestBase;
import com.loop.test.utilities.PizzaOrderWebTableUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/*
   1. go to https://loopcamp.vercel.app/web-tables.html
   2. create a method to test given field for a given name
   3. test type
   4. test amount
   5. test date
   6. test street
   7. test city
   8. test state
   9. test zip
   10. test card
   11. test card number
   12. test exp
    */
public class T2_pizza_order extends TestBase {
    @Test
    public void test_pizza_type() {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Alexandra Gray";
        String expectedPizzaType = "Thin Crust";
        String actualPizzaType = PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Pizza type");
        assertEquals(actualPizzaType, expectedPizzaType, "ACTUAL DOES NOT MATCH EXPECTED");

        String expectedOrderNumber = "2";
        String actualOrderNumber = PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Amount");
        assertEquals(actualOrderNumber, expectedOrderNumber, "ACTUAL DOES NOT MATCH EXPECTED");

        String expectedDate = "04/15/2021";
        String actualDate = PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"Date");
        assertEquals(actualDate,expectedDate,"ACTUAL DOES NOT MATCH EXPECTED");

        String expectedStreet = "7, Miller Street";
        String actualStreet = PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"Street");
        assertEquals(actualStreet,expectedStreet, "ACTUAL DOES NOT MATCH EXPECTED");

        String expectedCity = "Chicago, IL";
        String actualCity = PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"City");
        assertEquals(actualCity,expectedCity,"ACTUAL DOES NOT MATCH EXPECTED");

        String expectedState = "US";
        String actualState = PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"State");
        assertEquals(actualState,expectedState,"ACTUAL DOES NOT MATCH EXPECTED" );

        String expectedZip ="748";
        String actualZip = PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"Zip");
        assertEquals(expectedZip,actualZip,"ACTUAL DOES NOT MATCH EXPECTED");

        String expectedCardType = "VISA";
        String actualCardType = PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"Card");
        assertEquals(expectedCardType,actualCardType,"ACTUAL DOES NOT MATCH EXPECTED");

        String expectedCardNumber = "321456789012";
        String actualCardNumber = PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"Card Number");
        assertEquals(expectedCardNumber,actualCardNumber,"ACTUAL DOES NOT MATCH EXPECTED");

        String expectedExpDate = "02/24";
        String actualExpDate = PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"Exp");
        assertEquals(expectedExpDate,actualExpDate,"ACTUAL DOES NOT MATCH EXPECTED");
    }
}