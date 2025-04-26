package org.example.ex02_RestAssured_TestNg_AllureReport;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting04_MultipleTc_TestNg {

    @Test
    @Description("TC1 - Verify response is 200 OK when valid pincode is given")
    public void testGetRequest_PosTc1()
    {
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560066")
                .when().get()
                .then().log().all().statusCode(200);
    }

    @Test
    @Description("TC2 - Verify response gives error when invalid pincode is given")
    public void testGetRequest_NegTc2()
    {
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/-1")
                .when().get()
                .then().log().all().statusCode(200);

    }

    @Test
    @Description("TC2 - Verify response gives error when invalid pincode is given")
    public void testGetRequest_NegTc3()
    {
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/@")
                .when().get()
                .then().log().all().statusCode(200);
    }
}
