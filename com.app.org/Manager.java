package com.app.org;

public class Manager extends Employee
{
	private int bonus;
	
	public Manager(int id, String name, int deptId, double sal, int bonus) 
	{
		super(id,name,deptId,sal);
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "MANAGER    : "
		     + "\nID        = " + super.getId() 
		     + "\nNAME      = " + super.getName() 
		     + "\nDEPT ID   = " + super.getDeptId() 
		     + "\nSALARY    = " + computeNetSal();
	}

	@Override
	public double computeNetSal() 
	{
		return super.getBasicSal() + getPerk() ;
	}
	
	public double getPerk()
	{
		return bonus * 0.01 * super.getBasicSal();
	}
}
