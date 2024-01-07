package com.app.shapes;

public class Rectangle extends Shape
{
	private double width,height;
	
	public Rectangle(int x, int y, double w, double h) 
	{
		super(x,y);
		this.width = w;
		this.height = h;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() 
	{		
		return "Rectangle :     "
			 + "\nWidth        :  " + width
			 + "\nHeight       :  " + height
			 + "\nCo-ordinates : (" + super.getX() + "," + super.getY()+")"; 
	}

	@Override
	public double perimeter() 
	{
		return (width * 2 + height * 2);
	}

	@Override
	public double area() 
	{
		return ( width * height );
	}
}
