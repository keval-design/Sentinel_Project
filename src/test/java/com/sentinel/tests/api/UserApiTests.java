package com.sentinel.tests.api;

import com.sentinel.api.GoRestClient;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static org.testng.Assert.*;

public class UserApiTests {
    @Test
    public void createReadUpdateDeleteUser() {
        GoRestClient client = new GoRestClient();
        String email = "sentinel." + System.currentTimeMillis() + "@example.com";
        String body = String.format("{\"name\":\"Sentinel Test\",\"gender\":\"male\",\"email\":\"%s\",\"status\":\"active\"}", email);

        Response create = client.createUser(body);
        assertEquals(create.statusCode(), 201);
        int id = create.jsonPath().getInt("id");

        Response read = client.getUser(id);
        assertEquals(read.statusCode(), 200);
        assertEquals(read.jsonPath().getString("email"), email);

        String updateBody = "{\"name\":\"Sentinel Updated\"}";
        Response update = client.updateUser(id, updateBody);
        assertEquals(update.statusCode(), 200);
        assertEquals(update.jsonPath().getString("name"), "Sentinel Updated");

        Response del = client.deleteUser(id);
        assertTrue(del.statusCode() == 204 || del.statusCode() == 200);
    }
}
