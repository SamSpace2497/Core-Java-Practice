package com.app.shapes;

import java.util.Random;
import java.util.Scanner;

public class ShapeGenerator 
{
	private static Random r = new Random(); 
	static Scanner sc = new Scanner(System.in);
	public static Shape generateShape()
	{
		switch (r.nextInt(3)) 
		{
		case 0: 
		{
			System.out.println("\nEnter Circle (X,Y)Co-ordinates, radius : ");
			return new Circle(sc.nextInt(), sc.nextInt(), sc.nextDouble());
		}
		case 1: 
		{
			System.out.println("\nEnter Rectangle (X,Y)Co-ordinates, width & height : ");
			return new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.nextDouble());
		}
		case 2: 
		{
			System.out.println("\nEnter Square (X,Y)Co-ordinates, side : ");
			return new Square(sc.nextInt(), sc.nextInt(), sc.nextDouble());
		}
		default:
			System.out.println("Unexpected Value...");
			return generateShape();
		}
	}

}
