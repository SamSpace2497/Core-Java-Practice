package com.farm;

public class Apple extends Fruit
{
	public Apple(String name) 
	{
		super(name);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fruit [name=" + getName() + "]";
	}
	
	@Override
	public void taste() 
	{
		System.out.println(getName()+ " is sweet in taste.");
		
	}
	 

}
