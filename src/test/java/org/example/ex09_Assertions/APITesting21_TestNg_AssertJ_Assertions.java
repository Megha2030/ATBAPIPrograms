package org.example.ex09_Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class APITesting21_TestNg_AssertJ_Assertions {

    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;

    String token;
    Integer bookingId;

    @Test
    public void testPost() {
        String payload = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking");
        rs.contentType(ContentType.JSON);
        rs.body(payload);

        r = rs.when().post();

        vr = r.then().log().all().statusCode(200);

        //TestNg assertions

        bookingId = r.then().extract().path("bookingid");
        String firstName = r.then().extract().path("booking.firstname");
        String lastName = r.then().extract().path("booking.lastname");

        Assert.assertNotNull(bookingId);
        Assert.assertEquals(firstName,"Jim");
        Assert.assertEquals(lastName,"Brown");

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(firstName,"Jim");
        sa.assertEquals(lastName,"Brown");
        sa.assertAll();

        //Assertj assertions
        assertThat(bookingId).isNotNull().isNotZero().isNotNegative();
        assertThat(firstName).isEqualTo("Jim").isNotEmpty().isNotBlank();
        assertThat(lastName).isEqualTo("Brown").isNotEmpty().isNotBlank();


    }
    }
