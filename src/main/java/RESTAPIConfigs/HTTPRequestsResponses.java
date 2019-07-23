package RESTAPIConfigs;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import java.io.File;

public class HTTPRequestsResponses
{
    public String GET(String URL, String Parameter)
    {
        RestAssured.baseURI = URL;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, Parameter);
        ResponseBody Body = response.getBody();
        return Body.asString();

    }

    public String POST(String URL, String Parameter, String Path)
    {
        File Payload = new File(Path);
        RestAssured.baseURI = URL;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.contentType("application/json").body(Payload).when().request(Method.POST, Parameter);
        ResponseBody Body = response.getBody();
        return Body.asString();

    }

    public String PUT(String URL, String Parameter, String Field)
    {
        RestAssured.baseURI = URL;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.contentType("application/json").body(Field).request(Method.PUT, Parameter);
        ResponseBody Body = response.getBody();
        return Body.asString();

    }

    public String DELETE(String URL, String Parameter)
    {
        RestAssured.baseURI = URL;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.DELETE, Parameter);
        ResponseBody Body = response.getBody();
        return Body.asString();

    }
}