package tests;

import apis.AlbumsApis;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AlbumsTest {
    @Test
    public void getAllAlbums()
    {
        Response response= AlbumsApis.getAllAlbums();
        assertThat(response.statusCode(),equalTo(200));
    }
    @Test
    public void getSingleAlbum()
    {
        Response response=AlbumsApis.getSingleAlbum();
        assertThat(response.statusCode(),equalTo(200));
    }
    @Test
    public void getAlbumPhotos()
    {
        Response response=AlbumsApis.getAlbumPhoto();
        assertThat(response.statusCode(),equalTo(200));
    }
    @Test
    public void addAlbum()
    {
        Response response=AlbumsApis.addAlbum();
        assertThat(response.statusCode(),equalTo(201));
    }
    @Test
    public void deleteAlbum()
    {
        Response response=AlbumsApis.deleteAlbum();
        assertThat(response.statusCode(),equalTo(200));
    }
}

