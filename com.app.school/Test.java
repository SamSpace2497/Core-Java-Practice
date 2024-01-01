package com.tester;

import com.school.Faculty;
import com.school.Student;

public class Test {

	public static void main(String[] args) 
	{
		Student s1 = new Student("SHUBHAM","PATIL",2022,"CDAC",99,104000);
		Faculty f1 = new Faculty("ANKIT", "SHINDE", 5, "DISASTER MANAGEMENT");
		
		System.out.println(s1.toString());
		System.out.println(f1.toString());
		System.out.println(s1.getFname()+" Student of "+f1.getFname()+" learning "+f1.getSub());
	}
}
