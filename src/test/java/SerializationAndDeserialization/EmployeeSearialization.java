package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.Employee;
import PojoClass.EmployeeWithArray;
import PojoClass.EmployeeWithObject;
import PojoClass.Spouse;

public class EmployeeSearialization {
	  @Test
     public void empSerial() throws JsonGenerationException, JsonMappingException, IOException {
		  //for Employee Pojo class
//		Employee emp=new Employee("kisan",123);
//		  ObjectMapper obj=new ObjectMapper();
//			obj.writeValue(new File(".\\src\\test\\resources\\emp.json"), emp);
		  
		  
		  //for EmployeeWithArray Pojo class
//		  int[] num= {12345,11234};
//		  EmployeeWithArray empArr=new EmployeeWithArray("kisan",123,num) ;
//		ObjectMapper obj=new ObjectMapper();
//		obj.writeValue(new File(".\\src\\test\\resources\\emp.json"), empArr);
		  
		  
		  //for EmployeeWithObject Pojo Class
		  int[] num= {12345,11234};
		  Spouse sp=new Spouse("ravi", num, "kvivek23@gmai.com");
		  
		  EmployeeWithObject empObj=new EmployeeWithObject("kisan",123,sp) ;
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File(".\\src\\test\\resources\\emp.json"), empObj);
		  
		  
	}
}
