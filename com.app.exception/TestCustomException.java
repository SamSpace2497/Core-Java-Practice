package com.app.tester;

import java.util.Scanner;
import static com.app.utils.SpeedUtils.validateSpeed;

public class TestCustomException {

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter Speed : ");
			validateSpeed(sc.nextInt());
			System.out.println("Speed Within Limits..");
			
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());;
		}
		System.out.println("Main Over..");

	}

}
