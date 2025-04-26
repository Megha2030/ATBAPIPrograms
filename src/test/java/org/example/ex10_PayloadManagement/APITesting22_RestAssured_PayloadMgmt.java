package org.example.ex10_PayloadManagement;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class APITesting22_RestAssured_PayloadMgmt {
    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;

    String token;
    Integer bookingId;

    @Test
    public void testPost() {
     /*   String payload = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}"; */

        Map<String,Object> jsonBody = new LinkedHashMap<>();
        jsonBody.put("firstname","Jim");
        jsonBody.put("lastname","Brown");
        jsonBody.put("totalprice",111);
        jsonBody.put("depositpaid",true);

        Map<String,Object> bookingDates = new LinkedHashMap<>();
        bookingDates.put("checkin","2018-01-01");
        bookingDates.put("checkout","2019-01-01");

        jsonBody.put("bookingdates",bookingDates);
        jsonBody.put("additionalneeds","Breakfast");

        System.out.println(jsonBody);



    }
}
