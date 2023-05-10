package DifferentWaysToPostRequest;
import static io.restassured.RestAssured.*;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UsingJsonFile {
	@Test
	public void usingJsonFile() {
		
	baseURI="http://rmgtestingserver";
	port=8084;
	
    File f=new File(".\\src\\test\\resources\\pro.json");
	given()
	.body(f)
	.contentType(ContentType.JSON)
	
	.when()
	.post("/addProject")
	
	.then()
	.assertThat()
	.statusCode(201)
	.contentType(ContentType.JSON)
	.time(Matchers.lessThan(2500L), TimeUnit.MILLISECONDS)
	.log().all();
}
}
