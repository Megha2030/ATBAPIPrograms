package org.example.ex10_PayloadManagement.gson;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting23_RestAssured_GSon {
    //GSON - google library which converts your class to JSON
    // JSON - is a plain text with key value pair to transfer from client to server

    RequestSpecification rs;
    Response r;
    ValidatableResponse vs;

    @Test
    public void testCreateBookingPTc()
    {
        //step1 - POST
        //URL -> Base uri + base path
        // header
        //body
        //auth - no

        //step2
        //prepare the payload (object -> JSON String)
        //send request

        //step3
        //validate response (JSON String -> object)
        // firstname
        // staus code

        Booking booking = new Booking();
        booking.setFirstname("Megha");
        booking.setLastname("D");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);

        BookingDates bookingDates =new BookingDates();
        bookingDates.setCheckin("2018-01-01");
        bookingDates.setCheckout("2019-01-01");
        booking.setBookingdates(bookingDates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);

        Gson gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);

        RequestSpecification rs;
        Response r;
        ValidatableResponse vr;

        rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking");
        rs.contentType(ContentType.JSON);
        rs.body(jsonStringBooking);

        r = rs.when().post();
        String jsonResponseString = r.asString();

        vr = r.then().log().all().statusCode(200);

        String firstName1 = r.then().extract().path("Booking.firstname");
        System.out.println(firstName1);

        

    }


}
