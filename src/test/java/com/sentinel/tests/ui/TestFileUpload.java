package com.sentinel.tests.ui;

import com.sentinel.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.nio.file.Paths;

public class TestFileUpload {
    WebDriver driver;

    @BeforeMethod
    public void setup(){ driver = WebDriverFactory.createDriver(); }
    @AfterMethod
    public void teardown(){ if(driver!=null) driver.quit(); }

    @Test
    public void testFileUpload() {
        driver.get(com.sentinel.utils.Config.ADMINLTE_BASE + "/pages/forms/general.html");
        By fileInput = By.cssSelector("input[type='file']");
        String filePath = Paths.get(System.getProperty("user.dir"), "src/test/resources/testdata/sample.txt").toString();
        driver.findElement(fileInput).sendKeys(filePath);
    }
}
