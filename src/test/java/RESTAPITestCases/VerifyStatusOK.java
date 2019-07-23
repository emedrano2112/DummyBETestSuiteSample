package RESTAPITestCases;

import RESTAPIConfigs.HTTPRequestStatuses;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class VerifyStatusOK extends HTTPRequestStatuses
{
    public void getAllEmployees()
    {
        HTTPRequestStatuses u_URL = new HTTPRequestStatuses();
        Assert.assertEquals(u_URL.GET("http://dummy.restapiexample.com/api/v1", "/employees"), 200);
        System.out.println("The employees have been retrieved. Status Code: 200.");
    }

    public void getEmployee()
    {
        HTTPRequestStatuses u_URL = new HTTPRequestStatuses();
        Assert.assertEquals(u_URL.GET("http://dummy.restapiexample.com/api/v1", "/employee/24940"), 200);
        System.out.println("The employee information has been retrieved. Status Code: 200.");
    }

    public void createEmployee()
    {
        HTTPRequestStatuses u_URL = new HTTPRequestStatuses();
        Assert.assertEquals(u_URL.POST("http://dummy.restapiexample.com/api/v1", "/create","/Users/emanuelmedrano/IdeaProjects/EndPointsTestUW/src/main/resources/CreateBody.json"), 200);
        System.out.println("The employee has been created successfully. Status Code: 200.");
    }

    public void updateEmployee()
    {
        HTTPRequestStatuses u_URL = new HTTPRequestStatuses();
        Assert.assertEquals(u_URL.PUT("http://dummy.restapiexample.com/api/v1", "/update/24940", "\"age\":\"23\""), 200);
        System.out.println("The employee has been updated successfully. Status Code: 200.");
    }

    public void deleteEmployee()
    {
        HTTPRequestStatuses u_URL = new HTTPRequestStatuses();
        Assert.assertEquals(u_URL.DELETE("http://dummy.restapiexample.com/api/v1", "/delete/719"), 200);
        System.out.println("The employee has been deleted successfully. Status Code: 200.");
    }
}
