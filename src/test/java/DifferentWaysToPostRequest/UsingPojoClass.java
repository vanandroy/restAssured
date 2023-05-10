package DifferentWaysToPostRequest;

import GenericLibrary.JavaUtility;
import PojoClass.UsingPojoClassBody;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
public class UsingPojoClass {
	@Test
	public void run() {
	JavaUtility jlib=new JavaUtility();
	int ran=jlib.getRandomNum();
	String pr="pr-"+ran;
	UsingPojoClassBody p=new UsingPojoClassBody("vk",pr,"running", 10);
	baseURI="http://rmgtestingserver";
	port=8084;
	given()
	.body(p)
	.contentType(ContentType.JSON)
	
	.when()
	.post("/addProject")
	
	.then()
	.assertThat()
	.statusCode(201)
	.contentType(ContentType.JSON)
	.time(Matchers.lessThan(1500L),TimeUnit.MILLISECONDS)
	.log().all();
	}
}
