package ResponseBodyValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.List;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicResponseValidation {
	@Test
	public void dynamicResp() {
		
		//precondition
		baseURI="http://rmgtestingserver";
		port=8084;
		String expData="TY_PROJ_3631";
		
		Response res=when()
		.get("/projects");
		
		//validation
		boolean flag=false;
	    List<String> pIds = res.jsonPath().get("projectId");
		for(String projectId:pIds) {
			if(projectId.equalsIgnoreCase(expData))
			{
				flag=true;
			}
		}
		Assert.assertTrue(flag);
		System.out.println("verified");
		res.then().log().all();
	}
}
