package tests;

import apis.UsersApis;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UsersTest {
    @Test
    public void getAllUsers()
    {
        Response response= UsersApis.getALlUsers();
        assertThat(response.statusCode(),equalTo(200));
    }
    @Test
    public void getSingleUser()
    {
        Response response=UsersApis.getSingleUser();
        assertThat(response.statusCode(),equalTo(200));
    }
    @Test
    public void addUser()
    {
        Response response=UsersApis.addUser();
        assertThat(response.statusCode(),equalTo(201));
    }
    @Test
    public void updateUser()
    {
        Response response=UsersApis.updateUser();
        assertThat(response.statusCode(),equalTo(200));
    }
    @Test
    public void deleteUser()
    {
        Response response=UsersApis.deleteUser();
        assertThat(response.statusCode(),equalTo(200));
    }
}
