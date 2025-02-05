package apis;

import base.Request_Specification;
import endpoints.End_Points;
import pojo.AddAlbum;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AlbumsApis {
    public static Response getAllAlbums()
    {
        return given()
                .spec(Request_Specification.getRequestSpec())
                .when()
                .get(End_Points.ALBUMS_EndPoint)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response getSingleAlbum()
    {
        return given()
                .spec(Request_Specification.getRequestSpec())
                .when()
                .get(End_Points.ALBUMS_EndPoint+"/"+3)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response getAlbumPhoto()
    {
        return given()
                .spec(Request_Specification.getRequestSpec())
                .when()
                .get(End_Points.ALBUMS_EndPoint+"/"+1+"/"+"Photos")
                .then()
                .log().all()
                .extract().response();
    }
    public static Response addAlbum()
    {
        AddAlbum body=new AddAlbum("30","10","ISlam Ismail");
        return given()
                .spec(Request_Specification.getRequestSpec())
                .body(body)
                .when()
                .post(End_Points.ALBUMS_EndPoint)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response deleteAlbum()
    {
        return given()
                .spec(Request_Specification.getRequestSpec())
                .when()
                .delete(End_Points.ALBUMS_EndPoint+"/"+10)
                .then()
                .log().all()
                .extract().response();
    }
}
