package basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Method {

    public static void main(String[] args)
    {
        RestAssured.baseURI="https://api.restful-api.dev";
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.header("Content-Type", "application/json");
        requestSpecification.header("username","fanish123");
        requestSpecification.header("password","1234");
        requestSpecification.body("{\"name\":\"AppleMacBookPro16\",\"data\":{\"year\":2019,\"price\":1849.99,\"CPUmodel\":\"IntelCorei9\",\"Harddisksize\":\"1TB\"}}");
        Response response=requestSpecification.post("/objects?id=3&id=5&id=10");
        System.out.print(response.prettyPrint());




    }
}
