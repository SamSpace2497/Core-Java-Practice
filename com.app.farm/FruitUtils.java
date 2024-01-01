package com.app.farmMarket;

import java.util.Random;

import com.farm.Fruit;

public class FruitUtils extends Fruit
{
	private static Random r = new Random();
	
    public static int trashed;
	
	public FruitUtils(String name) 
	{
		super(name);
	}
	
	public static void addFruit(Fruit f, Fruit[] basket, int index) 
	{
		basket[index] = f;
	}
	 
	public static Fruit randomFruit(Fruit[] basket) 
	{
		trashed = r.nextInt(basket.length) ;
		return basket[trashed];
	}
	

}

