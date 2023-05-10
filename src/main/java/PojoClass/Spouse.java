package PojoClass;

public class Spouse {
	String name;
	int[] phNo;
	String email;
	public Spouse (String name,int[] phNo,String email) {
		this.name=name;
		this.phNo=phNo;
		this.email=email;
	}
	public Spouse() {
		
	}
	public String getName() {
		return name;
	}
	public int[] getPhNo() {
		return phNo;
	}
	public String getEmail() {
		return email;
	}
	
}
