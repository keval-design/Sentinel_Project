package com.sentinel.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ContactsPage {
    private WebDriver driver;
    private By tableRows = By.cssSelector("table.table tbody tr");
    private By searchInput = By.cssSelector("input[type='search']");

    public ContactsPage(WebDriver driver) { this.driver = driver; }

    public void open() { driver.get(com.sentinel.utils.Config.ADMINLTE_BASE + "/pages/examples/contacts.html"); }

    public void search(String q) {
        driver.findElement(searchInput).clear();
        driver.findElement(searchInput).sendKeys(q);
    }

    public List<WebElement> getRows() { return driver.findElements(tableRows); }

    public String getCellText(int rowIndex, int colIndex) {
        List<WebElement> rows = getRows();
        return rows.get(rowIndex).findElements(By.tagName("td")).get(colIndex).getText();
    }
}
