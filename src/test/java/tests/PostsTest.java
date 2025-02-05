package tests;
import apis.PostsApis;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PostsTest {
    @Test
    public void getAllPosts()
    {
                Response response= PostsApis.getAllPosts();
                assertThat(response.statusCode(),equalTo(200));
    }
    @Test
    public void getSinglePost()
    {
               Response response=PostsApis.getSinglePost();
               assertThat(response.statusCode(),equalTo(200));
    }
    @Test
    public void getPostComments()
    {
                Response response=PostsApis.getPostComments();
                assertThat(response.statusCode(),equalTo(200));
    }
    @Test
    public void addPost()
    {
        Response response=PostsApis.addPost();
        assertThat(response.statusCode(),equalTo(201));
    }
    @Test
    public void modifyPost()
    {
        Response response=PostsApis.modifyPost();
        assertThat(response.statusCode(),equalTo(200));

    }
    @Test
    public void updatePost()
    {
        Response response=PostsApis.updatePost();
        assertThat(response.statusCode(),equalTo(200));

    }
    @Test
    public void deletePost()
    {
        Response response=PostsApis.deletePost();
        assertThat(response.statusCode(),equalTo(200));
    }
}
