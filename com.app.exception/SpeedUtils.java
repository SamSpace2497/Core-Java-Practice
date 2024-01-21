package com.app.utils;

public class SpeedUtils 
{
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	
	static {
		MIN_SPEED = 30;
		MAX_SPEED = 80;
	}
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException
	{
		if(speed < MIN_SPEED) 
		{
			throw new SpeedOutOfRangeException("Too Slow..");
		}
		if(speed > MAX_SPEED)
		{
			throw new SpeedOutOfRangeException("Too Fast..");
		}
	}

}
