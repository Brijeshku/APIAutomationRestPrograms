package com.thetestingacademy;

import io.restassured.RestAssured;

public class Test002 {

    public static void main(String[] args) {
        System.out.println("Rest assured test case");
        System.out.println("Get request demo");


//        given() // prescripts / headers, url , parameters , body
//        when()  // HTTP method , like , get,put, post ,delete..
//        then() // verify the response ER==AR

        RestAssured
                .given()
        .baseUri("https://restful-booker.herokuapp.com/booking")
        .basePath("/bookingid/1").log().all()
                .when()
                .get()
                .then().log().all()
                .statusCode(404);

//
    }
}
