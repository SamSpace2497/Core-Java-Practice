package com.app.shapes;

public class Circle extends Shape
{
	private double radius;
	
	public Circle(int x, int y, double r) 
	{
		super(x,y);
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() 
	{		
		return "Circle :                "
			 + "\nRadius              :  " + radius	
			 + "\nCentre Co-ordinates : (" + super.getX() + "," + super.getY()+")"; 
	}

	@Override
	public double perimeter() 
	{
		return (22 / 7 * 2 * radius);
	}

	@Override
	public double area() 
	{
		return ( 22 / 7 * radius * radius );
	}
	
	
	

}
