package com.app.shapes;

public class Square extends Shape
{
	private double side;
	
	public Square(int x, int y, double side) 
	{
		super(x,y);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() 
	{		
		return "Square :        "
			 + "\nSide         :  " + side
			 + "\nCo-ordinates : (" + super.getX() + "," + super.getY()+")"; 
	}

	@Override
	public double perimeter() 
	{
		return (side * 4);
	}

	@Override
	public double area() 
	{
		return ( side * side );
	}
}
