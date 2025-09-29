package com.sentinel.api;

import com.sentinel.utils.Config;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GoRestClient {
    private RequestSpecification req;

    public GoRestClient() {
        RestAssured.baseURI = Config.GOREST_BASE;
        req = RestAssured.given().auth().oauth2(Config.GOREST_TOKEN).contentType("application/json");
    }

    public Response createUser(String bodyJson) {
        return req.body(bodyJson).when().post("/users").then().extract().response();
    }

    public Response getUser(int id) {
        return req.when().get("/users/" + id).then().extract().response();
    }

    public Response updateUser(int id, String bodyJson) {
        return req.body(bodyJson).when().put("/users/" + id).then().extract().response();
    }

    public Response deleteUser(int id) {
        return req.when().delete("/users/" + id).then().extract().response();
    }
}
