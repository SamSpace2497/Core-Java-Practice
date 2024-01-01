package com.tester;

import java.util.Scanner;

import com.app.org.Employee;
import com.app.org.Manager;
import com.app.org.Worker;

public class TestOrganization {

	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		int counter = 0;
		
		System.out.println("ENTER RECRUITMENT SIZE :");
		
		Employee[] emps = new Employee[sc.nextInt()];
		
		while(!exit)
		{
			System.out.println("-------------------------------------");
			System.out.println("     #EMPLOYEE_MENU \n 1.HIRE MANAGER     :"
					                             + "\n 2.HIRE WORKER      :"
					                             + "\n 3.DISPLAY EMPLOYEES:"
					                             + "\n 4.EMPLOYEE PERK    :"
					                             + "\n 5.EXIT           ->");
			System.out.println("-------------------------------------");
			System.out.println("\n\nCHOOSE OPTION     :");
			
			switch(sc.nextInt())
			{
			case 1 : 
				if(counter < emps.length) 
				{
				System.out.println("-------------------------------------");
				System.out.println("ENTER MANAGER DETAILS :\nEMP.ID      :\nEMP.NAME    :\nDEPT.ID     :\nBASIC SALARY:\nBONUS(%)    : ");
				System.out.println("-------------------------------------");
				Manager m = new Manager(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt());
				emps[counter] = m;
				counter++;
				}else 
				{
					System.out.println("-------------------------------------");
					System.out.println("RECRUITMENT OVER...");
					System.out.println("-------------------------------------");
				}
				break;
				
			case 2 :
				if(counter < emps.length) 
				{
				System.out.println("-------------------------------------");
				System.out.println("ENTER WORKER DETAILS :\nEMP.ID      :\nEMP.NAME    :\nDEPT.ID     :\nBASIC SALARY:\nWORK HOURS   :\nRATE/HOUR   :");
				System.out.println("-------------------------------------");
				emps[counter] = new Worker(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextFloat(),sc.nextFloat());
				counter++;
				}else 
				{
					System.out.println("-------------------------------------");
					System.out.println("RECRUITMENT OVER...");
					System.out.println("-------------------------------------");
				}
				break;
				
			case 3 :
				System.out.println("-------------------------------------");
				System.out.println("EMPLOYEE DETAILS...");
				for(int i = 0; i<counter; i++)
				{
					System.out.println("\n"+emps[i]+"\n");
				}
				System.out.println("-------------------------------------");
				break;
				
			case 4 :
				System.out.println("-------------------------------------");
				System.out.println("EMPLOYEE ID : ");
				int id = (sc.nextInt());
				boolean inv = false;
				for (int j = 0; j < counter; j++)
				{
					if(emps[j].getId()== id)
					{
						if (emps[j] instanceof Manager)
						{
							System.out.println("Manager " + emps[j].getName()+ " has got " + ((Manager)emps[j]).getPerk() + "Rs. Bonus."  );
							inv = true;
						}else 
							if(emps[j] instanceof Worker)
						{
							System.out.println("Worker " + emps[j].getName()+ " takes total " + ((Worker)emps[j]).getPerk() + "Rs. extra charges."  );
							inv = true;
						}
					}
				}
				if(!inv)
				{
					System.out.println("INVALID ID....");
				}
				
				System.out.println("-------------------------------------");
				break;
				
			case 5 :
				exit = true;
				break;	
			}
		}
		sc.close();
		System.out.println("-------------------------------------");
		System.out.println("   TERMINATING..... ");	
		System.out.println("-------------------------------------");

	}

}
