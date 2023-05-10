package CrudWithBDD;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;
public class UpdateProject {
	@Test
	public void updateProject() {
		JavaUtility jlib=new JavaUtility();
		baseURI="http://rmgtestingserver";
		port=8084;
		 JSONObject job=new JSONObject();
		 job.put("createdBy", "vj");
		 job.put("projectName","proj"+jlib.getRandomNum());
		 job.put("status","running");
		 job.put("teamSize",10);
		 
		 given()
		 .body(job)
		 .contentType(ContentType.JSON)
		 
		 .when()
		 .put("/projects/TY_PROJ_4622")
		 
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(1500L), TimeUnit.MILLISECONDS)
		.log().all();
		
		
		
	}

}
