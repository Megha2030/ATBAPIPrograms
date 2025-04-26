package org.example.ex03_GETRequest;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting06_Get_NonBDDStyle {

    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;

    @Test
    @Description("TC1 - Verify response is 200 OK when valid pincode is given")
    public void testGetRequest_PosTc1()
    {
        String pincode = "560067";
        rs = RestAssured.given();
        rs.baseUri("https://api.zippopotam.us");
        rs.basePath("/IN/"+pincode);

        r = rs.when().get();

        vr = r.then().log().all().statusCode(200);

    }

    @Test
    @Description("TC2 - Verify response gives error when invalid pincode is given")
    public void testGetRequest_NegTc2()
    {
        String pincode = "-1";
        rs = RestAssured.given();
        rs.baseUri("https://api.zippopotam.us");
        rs.basePath("/IN/"+pincode);

        r = rs.when().get();

        vr = r.then().log().all().statusCode(404);

    }
}
