package com.app.school;

public class Student extends Person
{
	private int year;
	private String course;
	private int marks;
	private double fees;
	
	public Student(String fname, String lname, int year, String course, int marks, double fees) 
	{
		super(fname,lname);
		//System.out.println("Inside Student Constructor....");
		this.year = year;
		this.course = course;
		this.marks = marks;
		this.fees = fees;
	}
	  
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nYEAR      : " +year+ "\nCOURSE    : " +course+ "\nMARKS     : " +marks+ "\nFEES      : " +fees ;
	}

}
