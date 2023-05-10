package CrudWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class DeleteProject {
	@Test
	public void deleteProject() {
		//step 1: create the pre requisite request body
	   //step 2: perform the action
	Response response=RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_5153");
	  //validate the response
	response.then().log().all();
	   int actStatus=response.getStatusCode();
		Assert.assertEquals(204, actStatus);
	}
}
