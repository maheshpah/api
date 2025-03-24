package basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Method  {
    public static void main(String [] args)
    {
        RestAssured.baseURI="https://api.restful-api.dev";
        RequestSpecification requestSpecification= RestAssured.given();
        requestSpecification.header("username","fanish123");
        requestSpecification.header("password","1234");
        requestSpecification.response();
        Response response=requestSpecification.get("/objects");
        System.out.print(response.prettyPrint());
    }
}
