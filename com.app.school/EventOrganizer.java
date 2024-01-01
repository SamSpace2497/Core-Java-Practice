package com.app.school;

import java.util.Scanner;

import com.school.Faculty;
import com.school.Person;
import com.school.Student;

public class EventOrganizer {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		int counter = 0;
		
		System.out.println("ENTER MAX CAPACITY : ");
		
		Person[] participants = new Person[sc.nextInt()];
		
		while(!exit)
		{
			System.out.println("-------------------------------------");
			System.out.println("     #EVENT_MENU \n"
					         + " 1.REGISTER STUDENT :\n"
					         + " 2.REGISTER FACULTY :\n"
					         + " 3.DISPLAY DETAILS  :\n"
					         + " 4.EXIT->");
			System.out.println("-------------------------------------");
			System.out.println("\n\nCHOOSE OPTION     :");
			
			switch(sc.nextInt())
			{
			case 1 : 
				if(counter < participants.length) 
				{
				System.out.println("-------------------------------------");
				System.out.println("ENTER STUDENT DETAILS :\n"
						         + "FIRSTNAME :\n"
						         + "LASTNAME  :\n"
						         + "YEAR      :\n"
						         + "COURSE    :\n"
						         + "MARKS     :\n"
						         + "FEES      : ");
				System.out.println("-------------------------------------");
				Student s = new Student(sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble());
				participants[counter] = s;
				counter++;
				}else 
				{
					System.out.println("-------------------------------------");
					System.out.println("TICKETS UNAVAILABLE...");
					System.out.println("-------------------------------------");
				}
				break;
				
			case 2 :
				if(counter < participants.length) 
				{
				System.out.println("-------------------------------------");
				System.out.println("ENTER FACULTY DETAILS :\n"
						         + "FIRSTNAME :\n"
						         + "LASTNAME  :\n"
						         + "EXPERIENCE:\n"
						         + "SUBJECT    :");
				System.out.println("-------------------------------------");
				participants[counter] = new Faculty(sc.next(),sc.next(),sc.nextInt(),sc.next());
				counter++;
				}else 
				{
					System.out.println("-------------------------------------");
					System.out.println("TICKETS UNAVAILABLE...");
					System.out.println("-------------------------------------");
				}
				break;
				
			case 3 :
				System.out.println("-------------------------------------");
				System.out.println("PARTICIPANT DETAILS...");
				int i = 0;
				for(i = 0; i<counter; i++)
				{
					System.out.println(participants[i]);
				}
				System.out.println("-------------------------------------");
				break;
				
			case 4 :
				exit = true;
				break;	
			}
		}
		sc.close();
		System.out.println("-------------------------------------");
		System.out.println("\n   TERMINATING..... \n");	
		System.out.println("-------------------------------------");
	}

}
