package ru.netology.rest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest2 {


    @Test
    void shouldReturnPostedDataInRussian() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("русский текст")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("русский текст"));
    }
}