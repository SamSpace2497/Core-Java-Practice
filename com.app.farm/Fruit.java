package com.app.farm;

public class Fruit 
{
	private String name;
	
	public Fruit(String name) 
	{
		this.name = name;
		
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Fruit [name=" + name + "]";
	}
	
	public void taste() 
	{
		System.out.println("TASTE");
	}

}
