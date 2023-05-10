package PojoClass;

public class EmployeeWithObject {
	String name;
	int phNo;
	Spouse spouse;
	public EmployeeWithObject(String name,int phNo,Spouse spouse) {
		super();
		this.name=name;
		this.phNo=phNo;
		this.spouse=spouse;
	}
	public EmployeeWithObject()
	{
		
	}
	public String getName() {
		return name;
	}
	public int getPhNo() {
		return phNo;
	}
	public Spouse getSpouse() {
		return spouse;
	}
	
}
