package base;

import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class Request_Specification {

    public static RequestSpecification getRequestSpec() {
        return given()
                .baseUri("https://jsonplaceholder.typicode.com/")
                .contentType("application/json")
                .log().all();
    }
}
