package com.app.farm;

public class Orange extends Fruit
{
	public Orange(String name) 
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
		System.out.println(getName()+ " is sour in taste.");
		
	}
	 

}
