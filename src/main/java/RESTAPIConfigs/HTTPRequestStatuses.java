package RESTAPIConfigs;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;

public class HTTPRequestStatuses
{
    public int GET(String URL, String Parameter)
    {
        RestAssured.baseURI = URL;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, Parameter);
        int Status = response.getStatusCode();
        return Status;

    }

    public int POST(String URL, String Parameter, String Path)
    {
        File Payload = new File(Path);
        RestAssured.baseURI = URL;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.contentType("application/json").body(Payload).when().request(Method.POST, Parameter);
        int Status = response.getStatusCode();
        return Status;

    }

    public int PUT(String URL, String Parameter, String Field)
    {
        RestAssured.baseURI = URL;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.contentType("application/json").body(Field).request(Method.PUT, Parameter);
        int Status = response.getStatusCode();
        return Status;

    }

    public int DELETE(String URL, String Parameter)
    {
        RestAssured.baseURI = URL;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.DELETE, Parameter);
        int Status = response.getStatusCode();
        return Status;

    }
}
