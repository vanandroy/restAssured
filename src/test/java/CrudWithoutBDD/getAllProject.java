package CrudWithoutBDD;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class getAllProject {
	@Test
	public void getAllProject() {
		//step 1: create the pre requisite request body
		//step 2: perform the action
		Response response=RestAssured.get("http://rmgtestingserver:8084/projects");
		//validate the response
		response.then().log().all();
		int actStatus=response.getStatusCode();
		Assert.assertEquals(200, actStatus);
	}

}
