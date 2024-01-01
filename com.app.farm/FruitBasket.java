package com.app.tester;

import java.util.Scanner;

import com.app.farm.Apple;
import com.app.farm.Cherry;
import com.app.farm.Fruit;
import com.app.farm.Orange;
import com.app.farmMarket.FruitUtils;

public class FruitBasket {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int counter = 0;
		
		System.out.println("Enter Basket Size: ");
		Fruit[] basket = new Fruit[sc.nextInt()];
		
		while(!exit)
		{
			System.out.println("-------------------------------------");
			System.out.println("          #MENU "
					+ "\n 1.Add Apple              : "
					+ "\n 2.Add Orange             : "
					+ "\n 3.Add Cherry             : "
					+ "\n 4.Display Contents Taste : "
					+ "\n 5.Pick Random Fruit      : "
					+ "\n 6.EXIT                  ->");
			System.out.println("-------------------------------------");
			System.out.println("\n\nCHOOSE OPTION     :");
			
			switch(sc.nextInt()) 
			{
			
			case 1 :
				if(counter<basket.length)
				{
					System.out.println("-------------------------------------");
					System.out.println("Enter Apple Name : ");
					FruitUtils.addFruit(new Apple(sc.next()), basket, counter);
					System.out.println("New Apple added...");
					counter++;			
					System.out.println("-------------------------------------");					
				}else
				{
					System.out.println("-------------------------------------");
					System.out.println("Basket full...");
					System.out.println("-------------------------------------");
				}
				break;
				
			case 2 :
				if (counter<basket.length)
				{
					System.out.println("-------------------------------------");
					System.out.println("Enter Orange Name : ");
					FruitUtils.addFruit(new Orange(sc.next()), basket, counter);
					System.out.println("New Orange added...");
					counter++;				
					System.out.println("-------------------------------------");
				}
				else
				{
					System.out.println("-------------------------------------");
					System.out.println("Basket full...");
					System.out.println("-------------------------------------");
				}
				break;
				
			case 3 :
				if (counter<basket.length)
				{
					System.out.println("-------------------------------------");
					System.out.println("Enter Cherry Name : ");
					FruitUtils.addFruit(new Cherry(sc.next()), basket, counter);
					System.out.println("New Cherry added...");
					counter++;
					System.out.println("-------------------------------------");
					}else
				{
					System.out.println("-------------------------------------");
					System.out.println("Basket full...");
					System.out.println("-------------------------------------");
				}break;
				
			case 4 :
				System.out.println("-------------------------------------");
				if(counter > 0)
				{
					System.out.println("Basket Fruits Taste: \n");
					for(int i = 0; i<basket.length; i++)
					{
						if ( basket[i] != null)
							basket[i].taste();
					}
				}else
				{
					System.out.println("Empty Basket...");
				}				
				System.out.println("-------------------------------------");				
     			break;
				
			case 5 :
				System.out.println("-------------------------------------");
				if(counter > 0)
				{
					Fruit f = FruitUtils.randomFruit(basket);
					if (f == null)
					{
					  do {
					  f = FruitUtils.randomFruit(basket);
					  }while(f == null);
					}
					System.out.println("You got a "+ f.getName());
					basket[FruitUtils.trashed] = null;
					counter--;
				}else
				{
					System.out.println("Empty Basket...");
				}
				System.out.println("-------------------------------------");
				break;
				
			case 6 :
				exit = true;
				break;
			
			default :
				break;
			
			}
		}
		sc.close();
		System.out.println("-------------------------------------");
		System.out.println("\n   TERMINATING..... \n");	
		System.out.println("-------------------------------------");
	

	}

}
