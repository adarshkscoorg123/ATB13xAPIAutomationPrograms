package com.thetestingacademy.ex_04_RestAssured_HTTPMethods.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting012_PATCH_NONBddStyle {

    // Patch

    // token, booking ID - A
    // public void get_token(){ }
    // public void get_booking_id(){}

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_patch_non_bdd() {
        String bookingid = "410";
        String token = "250d83d12e0ef4c";

        String payload = "{\n" +
                "    \"firstname\" : \"Pramod1\",\n" +
                "    \"lastname\" : \"Brown2\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        // r.header("Cookie","token="+token);
        r.cookie("token", token);
        r.body(payload).log().all();



        response = r.when().log().all().patch();

        vr = response.then().log().all();
        vr.statusCode(200);

    }
}
