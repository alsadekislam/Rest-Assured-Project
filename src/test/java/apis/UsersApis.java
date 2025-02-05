package apis;

import base.Request_Specification;
import endpoints.End_Points;
import io.restassured.response.Response;
import java.io.File;

import static io.restassured.RestAssured.given;

public class UsersApis {
    public static Response getALlUsers()
    {
        return given()
                .spec(Request_Specification.getRequestSpec())
                .when()
                .get(End_Points.USERS_EndPoint)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response getSingleUser()
    {
        return given()
                .spec(Request_Specification.getRequestSpec())
                .when()
                .get(End_Points.USERS_EndPoint+"/"+1)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response addUser()
    {
        File body=new File("src\\test\\resources\\adduser.json");
        return given()
                .spec(Request_Specification.getRequestSpec())
                .body(body)
                .when()
                .post(End_Points.USERS_EndPoint)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response updateUser()
    {
        File body=new File("src\\test\\resources\\adduser.json");
        return given()
                .spec(Request_Specification.getRequestSpec())
                .body(body)
                .when()
                .put(End_Points.USERS_EndPoint+"/"+1)
                .then()
                .log().all()
                .extract().response();
    }
    public static Response deleteUser()
    {
        return given()
                .spec(Request_Specification.getRequestSpec())
                .when()
                .delete(End_Points.USERS_EndPoint+"/"+1)
                .then()
                .log().all()
                .extract().response();
    }
}
