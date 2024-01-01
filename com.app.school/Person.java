package com.app.school;

public class Person 
{
	private String fname;
	private String lname;
	
	public Person(String fname, String lname) 
	{
		//System.out.println("Inside Person Constructor....");
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Override
	public String toString() {
		return "\nNAME      : "+fname+ " "+lname;
	}
	
	

}
