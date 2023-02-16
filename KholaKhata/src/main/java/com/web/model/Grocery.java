package com.web.model;

public class Grocery
{
	
	public String getItem()
	{
		return item;
	}

	public void setItem(String item)
	{
		this.item = item;
	}

	public float getQuantity()
	{
		return quantity;
	}

	public void setQuantity(float quantity)
	{
		this.quantity = quantity;
	}

	public String getUnit()
	{
		return unit;
	}

	public void setUnit(String unit)
	{
		this.unit = unit;
	}

	public float getPrice()
	{
		return price;
	}

	public void setPrice(float price)
	{
		this.price = price;
	}

	private String item;
	private float quantity;
	private String unit;
	private float price;
	public Grocery(String item, float quantity, String unit, float price)
	{
		this.item = item;
		this.quantity = quantity;
		this.unit = unit;
		this.price = price;
	}

	public Grocery()
	{
	}
	
	
	
	
	
}
