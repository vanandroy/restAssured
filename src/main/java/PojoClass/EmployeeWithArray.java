package PojoClass;

public class EmployeeWithArray {
	String name;
	int eid;
	int[] mobNo;
	public EmployeeWithArray(String name,int eid,int[] mobNo) {
		this.name=name;
		this.eid=eid;
		this.mobNo=mobNo;
	}
	public EmployeeWithArray() {
		
	}
	
	public String getName() {
		return name;
	}
	public int getEid() {
		return eid;
	}
	public int[] getmobNo() {
		return mobNo;
	}
}
