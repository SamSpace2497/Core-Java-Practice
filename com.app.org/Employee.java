package com.app.org;

public class Employee 
{
	private int id;
	private String name;
	private int deptId;
	private double basicSal;
	
	public Employee(int id, String name, int deptId, double sal) 
	{
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		basicSal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	@Override
	public String toString() {
		return "EMPLOYEE         :  "
				+ "\nID           = " + id 
				+ "\nNAME         = " + name 
				+ "\nDEPT ID      = " + deptId 
				+ "\nBASIC SALARY = " + basicSal ;
	}
	
	public double computeNetSal() 
	{
		return 0;
	}
	

}
