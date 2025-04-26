package org.example.ex01_RestAssured_Basics;

import io.restassured.RestAssured;

public class APITesting03_Multiple_Tcs {
    public static void main(String[] args) {
        // Given() - Prerequisite -> url, headers, AUth, Body
        //When() -> http method -> GET, POST, PUT, DELETE
        //Then() -> Validation -> if statu code is 200 OK

        //full url -> https://api.zippopotam.us/IN/560066
        // base uri -> https://api.zippopotam.us
        // base path -> /IN/560066
            String pincode = "560066";

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);

        pincode = "@";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);

        pincode = "-1";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);

    }
}
