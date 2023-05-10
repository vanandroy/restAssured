package CrudWithBDD;
import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetAllProjects {
	@Test
	public void getAllProject() {
		baseURI="http://rmgtestingserver";
		port=8084;
		
		when()
		.get("/projects")
		
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(2500L), TimeUnit.MILLISECONDS)
		.log().all();
		
	}
}
