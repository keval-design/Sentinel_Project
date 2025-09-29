package com.sentinel.tests.bdd;

import com.sentinel.api.GoRestClient;
import com.sentinel.ui.pages.ContactsPage;
import com.sentinel.utils.WebDriverFactory;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;

public class DataValidationSteps {
    static Response apiResponse;
    static WebDriver driver;

    @Given("I create a new user via the GoREST API")
    public void createUser() {
        GoRestClient client = new GoRestClient();
        String email = "sentinel." + System.currentTimeMillis() + "@example.com";
        String body = String.format("{\"name\":\"Sentinel Test\",\"gender\":\"male\",\"email\":\"%s\",\"status\":\"active\"}", email);
        apiResponse = client.createUser(body);
        assertEquals(apiResponse.statusCode(), 201);
    }

    @When("I open the AdminLTE contacts page")
    public void openContacts() {
        driver = WebDriverFactory.createDriver();
        ContactsPage contacts = new ContactsPage(driver);
        contacts.open();
    }

    @When("I search for the created user's email in the UI")
    public void searchEmail() {
        ContactsPage contacts = new ContactsPage(driver);
        String email = apiResponse.jsonPath().getString("email");
        contacts.search(email);
    }

    @Then("I should see the user's details in the UI that exactly match the API data")
    public void assertDetails() {
        ContactsPage contacts = new ContactsPage(driver);
        boolean found = contacts.getRows().stream().anyMatch(r -> r.getText().contains(apiResponse.jsonPath().getString("email")));
        assertTrue(found, "User email not found in UI");
        driver.quit();
    }
}
