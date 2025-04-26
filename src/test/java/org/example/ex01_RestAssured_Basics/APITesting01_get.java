package org.example.ex01_RestAssured_Basics;

import io.restassured.RestAssured;

public class APITesting01_get {
    public static void main(String args[])
    {
        // Given() - Prerequisite -> url, headers, AUth, Body
        //When() -> http method -> GET, POST, PUT, DELETE
        //Then() -> Validation -> if statu code is 200 OK

        //full url -> https://api.zippopotam.us/IN/560066
            // base url -> https://api.zippopotam.us
            // bse path -> /IN/560066

        RestAssured.given()
                           .baseUri("https://api.zippopotam.us")
                           .basePath("/IN/560066")
                  .when().get()
                  .then().log().all().statusCode(200);
    }
}
