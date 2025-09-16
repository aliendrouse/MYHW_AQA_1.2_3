package ru.netology.rest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest3 {

    @Test
    void shouldFailWithWrongJsonPath() {
        given()
                .baseUri("https://postman-echo.com")
                .body("test data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("wrong_field", equalTo("test data"));
    }
}