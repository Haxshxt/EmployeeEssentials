package com.dto;

public class EmployeeDto {

	@Override
	public String toString() {
		return "Employee : [eid=" + eid + ", eName=" + eName + ", eAddress=" + eAddress + ", salary=" + salary + "]";
	}
	private int eid;
	private String eName;
	private String eAddress;
	private int salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAddress() {
		return eAddress;
	}
	public EmployeeDto(int eid, String eName, String eAddress, int salary) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.eAddress = eAddress;
		this.salary = salary;
	}
	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
