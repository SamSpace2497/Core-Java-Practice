package com.app.school;

public class Faculty extends Person
{
	private int exp;
	private String sub;
	
	public Faculty(String fname, String lname,int exp, String sub) 
	{
		super(fname,lname);
		//System.out.println("Inside Faculty Constructor....");
		this.exp = exp;
		this.sub = sub;
	}
	 
	
	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public String getSub() {
		return sub;
	}


	public void setSub(String sub) {
		this.sub = sub;
	}


	@Override
	public String toString() {
		return super.toString()+ "\nEXPERIENCE: "+exp+ "\nSUBJECT    : "+sub;
	}

}
