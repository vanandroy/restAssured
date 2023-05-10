package CrudWithBDD;
import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteProject {
	@Test
	public void deleteProject() {
		baseURI="http://rmgtestingserver";
		port=8084;
		
		when()
		.delete("/projects/TY_PROJ_5301")
		
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(1500L),TimeUnit.MILLISECONDS)
		.log().all();
	}
}
