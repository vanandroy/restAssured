package ResponseBodyValidation;
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class StaticResponseValidation {
	@Test
	public void staticResp() {
		
		//precondition
		baseURI="http://rmgtestingserver";
		port=8084;
		String expData="TY_PROJ_3631";
		
		Response res=when()
		.get("/projects");
		
		//validation
		String actData=res.jsonPath().get("[0].projectId");
		Assert.assertEquals(expData, actData);
		System.out.println("verified");
		res.then().log().all();
		
	}
}
