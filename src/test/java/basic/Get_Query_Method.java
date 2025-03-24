package basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Query_Method {
    public static void main(String [] args)
    {
        RestAssured.baseURI="https://api.restful-api.dev";
        RequestSpecification requestSpecification= RestAssured.given();
        requestSpecification.header("username","fanish123");
        requestSpecification.header("password","1234");
        Response response=requestSpecification.get("/objects?id=3&id=5&id=10");
        System.out.print(response.prettyPrint());


    }
}
