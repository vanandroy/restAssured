package PojoClass;

public class Employee {
	//declare the variable
	String name;
	int eid;
	//initialize the variable
	public Employee(String name,int eid) {
		this.name=name;
		this.eid=eid;
	}
	// creating empty constructor to trigger searialization and desearialization
	public Employee() {
		
	}
	//getter and setter
	public String getName() {
		return name;
	}
	public int getEid() {
		return eid;
	}
	
}
