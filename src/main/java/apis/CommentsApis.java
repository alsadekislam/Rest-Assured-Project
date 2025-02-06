package apis;

import base.Request_Specification;
import endpoints.End_Points;
import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.given;

public class CommentsApis {
    public static Response getAllComments()
    {
        return given()
                .spec(Request_Specification.getRequestSpec())
                .when()
                .get(End_Points.COMMENTS_EndPoint)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response getSingleComment()
    {
        return  given()
                .spec(Request_Specification.getRequestSpec())
                .when()
                .get(End_Points.COMMENTS_EndPoint+"/"+1)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response updateComment()
    {
        File body=new File("src/test/resources/updatecomment.json");
        return  given()
                .spec(Request_Specification.getRequestSpec())
                .body(body)
                .when()
                .put(End_Points.COMMENTS_EndPoint+"/"+1)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response addComment()
    {
        File body=new File("src/test/resources/updatecomment.json");
        return  given()
                .spec(Request_Specification.getRequestSpec())
                .body(body)
                .when()
                .post(End_Points.COMMENTS_EndPoint)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response deleteComment()
    {

        return  given()
                .spec(Request_Specification.getRequestSpec())
                .when()
                .delete(End_Points.COMMENTS_EndPoint+"/"+1)
                .then()
                .log().all()
                .extract().response();
    }
}
