package DifferentWaysToPostRequest;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import GenericLibrary.JavaUtility;
import io.restassured.http.ContentType;

public class JsonObject {
	@Test
	public void jsonObject() {
		JavaUtility jlib=new JavaUtility();
		JSONObject job=new JSONObject();
		job.put("createdBy", "vk");
		job.put("projectName", "pr-"+jlib.getRandomNum());
		job.put("status", "running");
		job.put("teamSize", 23);
		
		baseURI="http://rmgtestingserver";
		port=8084;
		given()
		.body(job)
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
