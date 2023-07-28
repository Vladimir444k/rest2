package ru.nenology.test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {
    @Test
    void shouldPostmanTest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("HI")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hi"))
        ;
    }
}
