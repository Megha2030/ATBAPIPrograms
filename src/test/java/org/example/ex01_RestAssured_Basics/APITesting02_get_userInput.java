package org.example.ex01_RestAssured_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting02_get_userInput {
    public static void main(String args[])
    {
        // Given() - Prerequisite -> url, headers, AUth, Body
        //When() -> http method -> GET, POST, PUT, DELETE
        //Then() -> Validation -> if statu code is 200 OK

        //full url -> https://api.zippopotam.us/IN/560066
        // base url -> https://api.zippopotam.us
        // bse path -> /IN/560066

        Scanner sc = new Scanner(System.in);
        System.out.println("enter pincode");
        String picode = sc.next();

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+picode)
                .when().get()
                .then().log().all().statusCode(200);
    }
}
