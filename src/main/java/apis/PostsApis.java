package apis;

import base.Request_Specification;
import endpoints.End_Points;
import pojo.AddPost;
import io.restassured.response.Response;

import static endpoints.End_Points.POSTS_EndPoint;
import static io.restassured.RestAssured.given;

public class PostsApis {
    public static Response getAllPosts()
    {
        return given()
                .spec(Request_Specification.getRequestSpec())
                .when()
                .get(End_Points.POSTS_EndPoint)
                .then()
                .extract().response();
    }
    public static Response getSinglePost()
    {
        return given()
                .spec(Request_Specification.getRequestSpec())
                .when()
                .get(End_Points.POSTS_EndPoint+"/"+20)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response getPostComments()
    {
        return given()
                .spec(Request_Specification.getRequestSpec())
                .when()
                .get(POSTS_EndPoint+"/"+20+"/"+"comments")
                .then()
                .log().all()
                .extract().response();

    }
    public static Response addPost()
    {
        AddPost body =new AddPost("5","3","Islam Ismail","Islam Ismail");
        return given()
                .spec(Request_Specification.getRequestSpec())
                .body(body)
                .when()
                .post(End_Points.POSTS_EndPoint)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response modifyPost()
    {
        AddPost body =new AddPost("5","4","Islam Ismail","Islam Ismail");
        return given()
                .spec(Request_Specification.getRequestSpec())
                .body(body)
                .when()
                .patch(POSTS_EndPoint+"/"+20)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response updatePost()
    {
        AddPost update =new AddPost("5","4","Islam Ismail","Islam Ismail");

        return given()
                .spec(Request_Specification.getRequestSpec())
                .body(update)
                .when()
                .patch(POSTS_EndPoint+"/"+20)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response deletePost()
    {
        return given()
                .spec(Request_Specification.getRequestSpec())
                .when()
                .delete(POSTS_EndPoint+"/"+20)
                .then()
                .log().all()
                .extract().response();

    }
}
