package tests;

import apis.CommentsApis;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CommentsTest {
    @Test
    public void getAllComments()
    {
        Response response= CommentsApis.getAllComments();
        assertThat(response.statusCode(),equalTo(200));
    }
    @Test
    public void getSingleComment()
    {
        Response response= CommentsApis.getSingleComment();
        assertThat(response.statusCode(),equalTo(200));
    }
    @Test
    public void updateComment()
    {
        Response response= CommentsApis.updateComment();
        assertThat(response.statusCode(),equalTo(200));
    }
    @Test
    public void addComment()
    {
        Response response= CommentsApis.addComment();
        assertThat(response.statusCode(),equalTo(201));
    }
    @Test
    public void deleteComment()
    {
        Response response= CommentsApis.deleteComment();
        assertThat(response.statusCode(),equalTo(200));
    }
}
