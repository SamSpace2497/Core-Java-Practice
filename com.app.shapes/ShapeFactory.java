package com.app.tester;

import java.util.Scanner;

import com.app.shapes.*;

public class ShapeFactory {

	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. Of Shapes : ");
		int k = sc.nextInt();
		for(int i = 0 ; i < k; i++)
		{
			Shape S = ShapeGenerator.generateShape();
			
			System.out.println(S.toString());
			System.out.println("Perimeter           : " + S.perimeter()
					         + "\nArea                : " + S.area());
		}
		sc.close();

	}

}
