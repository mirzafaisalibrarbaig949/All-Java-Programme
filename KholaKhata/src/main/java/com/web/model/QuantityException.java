package com.web.model;

public class QuantityException extends Exception
{
	private String msg;

	public QuantityException(String msg)
	{
		super(msg);
		this.msg = msg;
	}
	
	
}
