package CrudWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class UpdateProject {
	@Test
	public void updateProject() {
		JavaUtility jLib=new JavaUtility();
		//step 1: create the pre requisite request body
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy","Vivek");
		jObj.put("projectName", "pro-"+jLib.getRandomNum());
		jObj.put("status", "completed");
		jObj.put("teamSize", 15);
		
		RequestSpecification req=RestAssured.given();
		req.body(jObj);
		req.contentType(ContentType.JSON);
		
		//step 2:perform action
		Response response=req.put("http://rmgtestingserver:8084/projects/TY_PROJ_5141");
		
		//validate the response
	   response.then().log().all();
	   int actStatus=response.getStatusCode();
		Assert.assertEquals(200, actStatus);
		
	}
}
