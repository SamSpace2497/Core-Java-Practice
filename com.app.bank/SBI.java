package com.app.bank;


public class SBI implements Bank 
{
	private int acc;
	private String name;
	private String type;
	private double balance;
	private String docs;
	private final static float ROI = 0.035f; 
	private double fd ;
	
	public SBI(int accNo,String name, String type, double bal, String docs) 
	{
		this.acc = accNo;
		this.name = name;
		this.type = type;
		this.balance = bal;
		this.docs = docs;
			
		System.out.println("\nAccount created...\n"
				         + "\nAccount Details  " 
				         + "\nAccount No. : " + acc 
				         + "\nName        : " + name
					     + "\nType        : " + type
					     + "\nBalance     : " + balance + " Rs."
					     + "\nDocument    : " + docs);
	}
	
	@Override
	public String toString() {
		return    "State Bank of India :\n"
				+ "Account Number : " + acc 
			  + "\nName           : " + name 
			  + "\nType           : " + type  
			  + "\nBalance        : " + balance + " Rs."
			  + "\nDocument       : " + docs ;
	}

	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = acc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDocs() {
		return docs;
	}

	public void setDocs(String docs) {
		this.docs = docs;
	}

	@Override
	public String addBal(double amt) 
	{
		balance += amt ;
		return "New Balance : " + balance + "Rs.";
	}

	@Override
	public String redBal(double amt) 
	{
		if(balance > 0 )
		{
			balance -= amt ;
			return "New Balance : " + balance + "Rs.";
		}else
		{
			return "Insufficient Balance...";
		}
	}
	
	@Override
	public double depoCalc(int year, double amt)
	{
		return amt +( ROI * year * amt );
	}
	
	@Override
	public void fixDepo(int year, double amt)
	{
		if(balance>1000) 
		{
			if(fd == 0)
			{
				fd = depoCalc(year,amt);
				System.out.println("Fix Deposit safely created...");
				balance -= amt;
				System.out.println("New Balance : " + getBalance() + "Rs.");
			}else
			{
				System.out.println("Pre-existing FD...");
			}
			
		}else
		{
			System.out.println("Insufficient Balance...\n Please Add Cash...");
		}
	}
	
	@Override
	public void breakDepo()
	{
		if(fd == 0) 
		{
			System.out.println("No Withstanding FD...");
			
		}else
		{
			balance += fd;
			System.out.println("Fix Deposit Terminated...");
			System.out.println("New Balance : " + getBalance() + "Rs.");		
		}
	}
}
