package org.example.ex04_POSTRequest;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting07_POST_NonBDDStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    String payload =  "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";

    @Test
    @Description("Verify post request")
    public void testPostRequest_PosTc1()
    {
     // URL, Method, Payload/ body / headers
        //Auth
        r= RestAssured.given();
               r.baseUri("https://restful-booker.herokuapp.com");
               r.basePath("/auth");
               r.contentType(ContentType.JSON);
               r.body(payload);

        response = r.when().post();


        vr = response.then().log().all().statusCode(200);


    }
}
