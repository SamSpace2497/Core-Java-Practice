package com.app.bank;

public interface Bank 
{	
	String addBal(double amt);
	
	String redBal(double amt);
	
    double depoCalc(int year, double amt);
	
	void fixDepo(int year, double amt);
	
	public void breakDepo();
	
}
