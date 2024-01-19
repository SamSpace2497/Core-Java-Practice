package com.app.bankUtil;

import java.util.Random;
import java.util.Scanner;

import com.app.bank.Bank;
import com.app.bank.HDFC;
import com.app.bank.SBI;

public abstract class ATM implements Bank
{
	static Scanner sc = new Scanner(System.in);
	static Random r = new Random();
	static int counter = 0;
	static int d =10000;
	
	static Bank accts[] = new Bank[1000];
	
	public static final int numberGenerator()
	{
		d++;
		return d;
	}

	public static void createAcc()
	{
		if(counter<accts.length)
		{
			System.out.println("-------------------------------------");
			System.err.println("Do you have all the neccesary documents ? yes/no");
			if( sc.next().equals("no"))
			{
				System.out.println("Please bring valid documents... ");
				return ;				
			}
			System.out.println("Which Bank would you like to get associated with ?\n 1.State Bank of India \n 2.HDFC Bank");
			switch (sc.nextInt())
			{
			case 1: 
			{
				System.out.println("Provide Details : \n"
						         + "Name            : \n"
						         + "Type of Account : (savings/current)\n"
						         + "Initial Balance : (>1000)\n"
						         + "Document        : (for verification) ");
				
				accts[counter] = new SBI( ATM.numberGenerator(), sc.next(), sc.next(), sc.nextDouble(), sc.next());
			    counter++;
				break;
			}
			case 2: 
			{
				System.out.println("Provide Details : \n"
				         + "Name            : \n"
				         + "Type of Account : (savings/current)\n"
				         + "Initial Balance : (>1000)\n"
				         + "Document        : (for verification) ");
		
	        	accts[counter] = new HDFC( ATM.numberGenerator(), sc.next(), sc.next(), sc.nextDouble(), sc.next());
	            counter++;
	        	break;
			}
			default:
				break;
			}			
			System.out.println("-------------------------------------");					
		}else
		{
			System.out.println("-------------------------------------");
			System.out.println("Service unavailable at the moment...");
			System.out.println("-------------------------------------");
		}
		
	}

	public static void addCash(int ref)
	{
		boolean flag = false;
		for(Bank b : accts)
		{
			if(b instanceof SBI) 
			{
				if(((SBI)b).getAcc() == ref)
				{
					System.out.println("Enter Amount : ");
					System.out.println(b.addBal(sc.nextInt()));
					flag = true;
				}	
			}
			if(b instanceof HDFC) 
			{
				if(((HDFC)b).getAcc() == ref)
				{
					System.out.println("Enter Amount : ");
					System.out.println(b.addBal(sc.nextInt())); 
					flag = true;
				}	
			}
		}
		if(!flag)
		{
			System.out.println("Invalid account number...  ");
		}else
		{
			System.out.println("Cash Added...");
		}
		
	}
	
	public static void withdrawCash(int ref)
	{
		boolean flag = false;
		for(Bank b : accts)
		{
			if(b instanceof SBI) 
			{
				if(((SBI)b).getAcc() == ref)
				{
					System.out.println("Enter Amount : ");
					System.out.println(b.redBal(sc.nextDouble())); 
					flag = true;
				}	
			}
			if(b instanceof HDFC) 
			{
				if(((HDFC)b).getAcc() == ref)
				{
					System.out.println("Enter Amount : ");
					System.out.println(b.redBal(sc.nextDouble()));
					flag = true;
				}	
			}
		}
		if(!flag)
		{
			System.out.println("Invalid account number...  ");
		}else
		{
			System.out.println("Cash Withdrawn...");
		}
		
	}
	
	public static void transFund(int refA) 
	{	
		boolean flag = false;
		for(Bank A : accts)
		{
			if(A instanceof SBI) 
			{
				if(((SBI)A).getAcc() == refA)
				{
					System.out.println("Enter Receiver Account Number: ");
					int refB = sc.nextInt();
					for(Bank B : accts)
					{
						if(B instanceof SBI)
						{
							if(((SBI)B).getAcc() == refB)
							{
								System.out.println("Enter Transfer Amount : ");
								Double amt = sc.nextDouble();
								System.out.println(A.redBal(amt)); 
								B.addBal(amt);
								flag = true;
						    }
						}
						if(B instanceof HDFC)
						{
							if(((HDFC)B).getAcc() == refB)
							{
								System.out.println("Transferring to different Bank, Charges will be levied...");
								System.out.println("Enter Transfer Amount : ");
								Double amt = sc.nextDouble();
								Double fine = 0.025 * amt ;
								System.out.println(A.redBal(amt)); 
								B.addBal(amt - fine);
								flag = true;
							}
						}
						 
					}					
				}	
			}
			if(A instanceof HDFC) 
			{
				if(((HDFC)A).getAcc() == refA)
				{
					System.out.println("Enter Receiver Account Number: ");
					int refB = sc.nextInt();
					for(Bank B : accts)
					{
						if(B instanceof HDFC)
						{
							if(((HDFC)B).getAcc() == refB)
							{
								System.out.println("Enter Transfer Amount : ");
								Double amt = sc.nextDouble();
								System.out.println(A.redBal(amt));
								B.addBal(amt);
								flag = true;
							}
						}
						if(B instanceof SBI)
						{
							if(((SBI)B).getAcc() == refB)
							{
								System.out.println("Transferring to different Bank, Charges will be levied...");
								System.out.println("Enter Transfer Amount : ");
								Double amt = sc.nextDouble();
								Double fine = 0.03 * amt ;
								System.out.println(A.redBal(amt));
								B.addBal(amt - fine);
								flag = true;
							}
						}
					}					
				}	
			}
		}
		if(!flag)
		{
			System.out.println("Invalid Account Numbers...  ");
		}else
		{
			System.out.println("Cash Transferred Succesfully...");
		}
	}
	
	public static void showDetails(int ref)
	{	
		boolean flag = false;
		for(Bank b : accts)
		{
			if(b instanceof SBI) 
			{
				if(((SBI)b).getAcc() == ref)
				{
					System.out.println("-------------------------------------");
					System.out.println(b.toString());
					System.out.println("-------------------------------------");
					flag = true;
				}	
			}
			if(b instanceof HDFC) 
			{
				if(((HDFC)b).getAcc() == ref)
				{
					System.out.println("-------------------------------------");
					System.out.println(b.toString());
					System.out.println("-------------------------------------");
					flag = true;
				}	
			}
		}
		if(!flag)
		{
			System.out.println("Invalid account number...  ");
		}
	}
	
	public static void calcFD(int ref)
	{
		boolean flag = false;
		for(Bank b : accts)
		{
			if(b instanceof SBI) 
			{
				if(((SBI)b).getAcc() == ref)
				{
					System.out.println("Enter No of years & Amount for FD");
					System.out.println("Investment Return : "+ b.depoCalc(sc.nextInt(),sc.nextDouble()));
					flag = true;
				}	
			}
			if(b instanceof HDFC) 
			{
				if(((HDFC)b).getAcc() == ref)
				{
					System.out.println("Enter No of years & Amount for FD");
					System.out.println("Investment Return : "+ b.depoCalc(sc.nextInt(),sc.nextDouble()));
					flag = true;
				}	
			}
		}
		if(!flag)
		{
			System.out.println("Invalid account number...  ");
		}
	}

	public static void createFD(int ref)
	{
		boolean flag = false;
		for(Bank b : accts)
		{
			if(b instanceof SBI) 
			{
				if(((SBI)b).getAcc() == ref)
				{
					System.out.println("Enter No of years & Amount for FD");
					b.fixDepo(sc.nextInt(),sc.nextDouble());
					flag = true;
				}	
			}
			if(b instanceof HDFC) 
			{
				if(((HDFC)b).getAcc() == ref)
				{
					System.out.println("Enter No of years & Amount for FD");
					b.fixDepo(sc.nextInt(),sc.nextDouble());
					flag = true;
				}	
			}
		}
		if(!flag)
		{
			System.out.println("Invalid account number...  ");
		}
	}
	
	public static void breakFD(int ref)
	{
		boolean flag = false;
		for(Bank b : accts)
		{
			if(b instanceof SBI) 
			{
				if(((SBI)b).getAcc() == ref)
				{
					b.breakDepo();
					flag = true;
				}	
			}
			if(b instanceof HDFC) 
			{
				if(((HDFC)b).getAcc() == ref)
				{
					b.breakDepo();
					flag = true;
				}	
			}
		}
		if(!flag)
		{
			System.out.println("Invalid account number...  ");
		}
	}
	
	public static void payBill(int ref)
	{
		boolean flag = false;
		for(Bank b : accts)
		{
			if(b instanceof SBI) 
			{
				if(((SBI)b).getAcc() == ref)
				{
					System.out.println("Service Unavailable...");
					flag = true;
				}	
			}
			if(b instanceof HDFC) 
			{
				if(((HDFC)b).getAcc() == ref)
				{
					double bill = r.nextInt(99,1000);
					System.out.println("Your Utlility Bill : " + bill + "Rs.");
					((HDFC)b).payBills(bill);
					flag = true;
				}	
			}
		}
		if(!flag)
		{
			System.out.println("Invalid account number...  ");
		}
	}
}
