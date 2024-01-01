package com.app.org;

public class Worker extends Employee 
{
	private float wHrs;
	private float rate;
	
	public Worker(int id, String name, int deptId, double sal, float wHrs, float rate) 
	{
		super(id,name,deptId,sal);
		this.wHrs = wHrs;
		this.rate = rate;
	}

	public float getwHrs() {
		return wHrs;
	}

	public void setwHrs(float wHrs) {
		this.wHrs = wHrs;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "WORKER : "
				+ "\nID           = " + super.getId() 
				+ "\nNAME         = " + super.getName() 
				+ "\nDEPT ID      = " + super.getDeptId() 
				+ "\nSALARY       = " + computeNetSal();
	}

	@Override
	public double computeNetSal() 
	{
		return super.getBasicSal() + getPerk() ;
	}
	
	public float getPerk()
	{
		return wHrs * rate;
	}
}
