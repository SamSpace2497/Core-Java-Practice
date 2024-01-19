package com.app.tester;

import java.util.Scanner;

import com.app.bankUtil.ATM;


public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		
		while(!exit)
		{
			System.out.println("-------------------------------------");
			System.out.println("                 #MENU               "
					+ "\n 1.New Account            : "
					+ "\n 2.Add Cash               : "
					+ "\n 3.Withdraw Cash          : "
					+ "\n 4.Transfer Fund          : "
					+ "\n 5.Bank Details           : "
					+ "\n 6.FD Calculator          : "
					+ "\n 7.Create FD              : "
					+ "\n 8.Break FD               : "
					+ "\n 9.Pay Bills              : "
					+ "\n 10.EXIT                ->  ");
			System.out.println("-------------------------------------");
			System.out.println("\n\nCHOOSE OPTION     :");
			
			switch(sc.nextInt()) 
			{
			
			case 1 :
				ATM.createAcc();
				break;
				
			case 2 :
				System.out.println("Enter Account Number : ");
				ATM.addCash(sc.nextInt());
				break;
				
			case 3 :
				System.out.println("Enter Account Number : ");
				ATM.withdrawCash(sc.nextInt());
				break;
				
			case 4 :
				System.out.println("Enter Sender Account Number: ");
				ATM.transFund(sc.nextInt());
				break;
							
			case 5 :
				System.out.println("Enter Account Number: ");
				ATM.showDetails(sc.nextInt());			
				break;
				
			case 6 :
				System.out.println("Enter Account Number: ");
				ATM.calcFD(sc.nextInt());
				break;
				
			case 7 :
				System.out.println("Enter Account Number: ");
				ATM.createFD(sc.nextInt());
				break;
				
			case 8 :
				System.out.println("Enter Account Number: ");
				ATM.breakFD(sc.nextInt());
				break;
				
			case 9 :
				System.out.println("Enter Account Number: ");
				ATM.payBill(sc.nextInt());
				break;
				
			case 10 :
				exit = true;
				break;
			
			default :
				break;
			}
		}
		sc.close();
		System.out.println("-------------------------------------");
		System.out.println("\n   TERMINATING..... \n       THANK YOU...\n\n      VISIT US AGAIN..");	
		System.out.println("-------------------------------------");
	}

}
