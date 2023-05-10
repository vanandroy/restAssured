package DifferentWaysToPostRequest;

import java.util.HashMap;
import org.testng.annotations.Test;
import GenericLibrary.JavaUtility;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;


public class UsingHashMapBody  
{
	
	@Test
	public static void usingHashMap() {
		baseURI="http://rmgtestingserver";
		port=8084;
		JavaUtility jlib=new JavaUtility();
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("createdBy", "vk");
		map.put("projectName", "pr-"+jlib.getRandomNum());
		map.put("status","completed");
		map.put("teamSize", 12);
		given()
		.body(map)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/addProject")
		
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		
		.log().all();
	}
}

