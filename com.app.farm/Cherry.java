package com.app.farm;

public class Cherry extends Fruit
{
	public Cherry(String name) 
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
		System.out.println(getName()+ " is sweet-n-sour in taste.");
		
	}
	 

}
