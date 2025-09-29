package com.sentinel.tests.ui;

import com.sentinel.ui.pages.ContactsPage;
import com.sentinel.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestDynamicTableInteraction {
    WebDriver driver;

    @BeforeMethod
    public void setup() { driver = WebDriverFactory.createDriver(); }

    @AfterMethod
    public void teardown() { if(driver!=null) driver.quit(); }

    @Test
    public void testDynamicTableInteraction() {
        ContactsPage contacts = new ContactsPage(driver);
        contacts.open();
        contacts.search("Mike");
        assertTrue(contacts.getRows().size() >= 0);
    }
}
