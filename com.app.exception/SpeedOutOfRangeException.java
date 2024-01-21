package com.app.exception;

@SuppressWarnings("serial")
public class SpeedOutOfRangeException extends Exception 
{
	public SpeedOutOfRangeException(String msg) 
	{
		super(msg);
	}
}
