package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.Employee;
import PojoClass.EmployeeWithArray;
import PojoClass.EmployeeWithObject;

public class EmployeeDeserialization {
	@Test
	public void EmpDeserial() throws JsonParseException, JsonMappingException, IOException {
		
		//for Employee Pojo class
 //		ObjectMapper obj=new ObjectMapper();
//		EmployeeWithArray data=obj.readValue(new File(".\\src\\test\\resources\\emp.json"), EmployeeWithArray.class);
		
		
		//for EmployeeWithArray Pojo class
//		ObjectMapper obj=new ObjectMapper();
//		EmployeeWithArray data=obj.readValue(new File(".\\src\\test\\resources\\emp.json"), EmployeeWithArray.class);
//		System.out.println(data.getName());
//		System.out.println(data.getEid());
//		System.out.println(data.getmobNo()[0]);
//		System.out.println(data.getmobNo()[1]);
		
		
		//for EmployeeWithObject Pojo class
		ObjectMapper obj=new ObjectMapper();
		EmployeeWithObject data=obj.readValue(new File(".\\src\\test\\resources\\emp.json"),EmployeeWithObject.class);
		System.out.println(data.getName());
		System.out.println(data.getPhNo());
		System.out.println(data.getSpouse().getEmail());
		System.out.println(data.getSpouse().getName());
		System.out.println(data.getSpouse().getPhNo()[0]);
		
	}

}
