package CrudWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.JavaUtility;
import static io.restassured.RestAssured.*;
import java.util.concurrent.TimeUnit;
import  io.restassured.http.ContentType;
import org.hamcrest.Matchers;

public class CreateProject {
	@Test
	public void createProject() {
		JavaUtility jlib=new JavaUtility();
		JSONObject job=new JSONObject();
		
		job.put("createdBy", "vk");
		job.put("projectName", "proj-"+jlib.getRandomNum());
		job.put("status", "running");
		job.put("teamSize", 10);
		
		given()
		.body(job)
		.contentType(ContentType.JSON)
		
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(1500L),TimeUnit.MILLISECONDS)
		.log().all();
	}
}
