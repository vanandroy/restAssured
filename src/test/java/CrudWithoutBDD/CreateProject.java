package CrudWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {
	@Test
	public void createProj() {
		JavaUtility jLib=new JavaUtility();
		//step 1: create the pre requisite request body
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy","Vivek");
		jObj.put("projectName", "pro-"+jLib.getRandomNum());
		jObj.put("status", "completed");
		jObj.put("teamSize", 12);
		
		RequestSpecification req=RestAssured.given();
		req.body(jObj);
		req.contentType(ContentType.JSON);
		
		//step 2: perform the action
		Response response=req.post("http://rmgtestingserver:8084/addProject");
		
		//validate the response
		System.out.println(response.getContentType());
		System.out.println(response.asString());
		System.out.println(response.prettyPrint());
	}
}
