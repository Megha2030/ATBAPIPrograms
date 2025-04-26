package org.example.ex03_GETRequest;

import io.restassured.RestAssured;

public class APITesting05_BDDStyle {
    public static void main(String[] args) {
        String pincode = "560066";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }
}
