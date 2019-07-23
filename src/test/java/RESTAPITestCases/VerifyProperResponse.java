package RESTAPITestCases;

import RESTAPIConfigs.HTTPRequestsResponses;
import org.testng.annotations.Test;

@Test
public class VerifyProperResponse extends HTTPRequestsResponses
{
    public void getAllEmployees()
    {
        HTTPRequestsResponses u_URL = new HTTPRequestsResponses();
        System.out.println("The employees are: " + u_URL.GET("http://dummy.restapiexample.com/api/v1", "/employees"));
    }

    public void getEmployee()
    {
        HTTPRequestsResponses u_URL = new HTTPRequestsResponses();
        System.out.println("The employees are: " + u_URL.GET("http://dummy.restapiexample.com/api/v1", "/employee/24940"));
    }

    public void createEmployee()
    {
        HTTPRequestsResponses u_URL = new HTTPRequestsResponses();
        System.out.println("The employee details are: " + u_URL.POST("http://dummy.restapiexample.com/api/v1", "/create", "/Users/emanuelmedrano/IdeaProjects/EndPointsTestUW/src/main/resources/CreateBody.json"));
    }

    public void updateEmployee()
    {
        HTTPRequestsResponses u_URL = new HTTPRequestsResponses();
        System.out.println("The new employee details are: " + u_URL.PUT("http://dummy.restapiexample.com/api/v1", "/update/24940", "\"age\":\"23\""));
    }

    public void deleteEmployee()
    {
        HTTPRequestsResponses u_URL = new HTTPRequestsResponses();
        System.out.println("The deletion confirmation is as follows: " + u_URL.DELETE("http://dummy.restapiexample.com/api/v1", "/delete/719"));
    }
}