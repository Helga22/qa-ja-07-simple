package com.telesens.framework.mobile.rest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscriberTests {

    @Test
    public void testGet() {

        RestAssured.baseURI = "http://localhost/rest/json";
        RestAssured.port = 8081;
        RequestSpecification request = RestAssured.given();
        Response response = request.get("/subscribers/1");
        ResponseBody body = response.body();
        JsonPath jsonPath = body.jsonPath();
        int id = jsonPath.getInt("id");
        String name = jsonPath.getString("firstName");
        int code = response.statusCode();

        Assert.assertEquals(code, 200);
        Assert.assertEquals(id, 1);
        Assert.assertEquals(name, "Peter");
    }

//    public void testAdd() {
//
//    }
}
