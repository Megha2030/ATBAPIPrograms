package org.example.ex07_DELETERequest;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting10_DELETE_NonBDDStyle {
    @Description("Verify the delete Request for the Restful Booker APIs")
    @Test
    public void test_delete_non_bdd() {

        String token = "86864aa8c5cf5e8";
        String bookingid = "10";


        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/" + bookingid);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token", token);

        requestSpecification.log().all();

        Response response = requestSpecification.when().delete();

        ValidatableResponse validatableResponse = response.then().log().all();

        // validatableResponse.statusCode(200);
        validatableResponse.statusCode(201);
    }
}
