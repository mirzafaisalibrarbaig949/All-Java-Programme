package com.web.model;

import java.util.Date;

public class GroceryHistory
{
		public Date getDate()
	{
		return date;
	}
	public void setDate(Date date)
	{
		this.date = date;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getItems()
	{
		return items;
	}
	public void setItems(String items)
	{
		this.items = items;
	}
	public Float getQuantity()
	{
		return quantity;
	}
	public void setQuantity(Float quantity)
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
	public Float getItemprice()
	{
		return Itemprice;
	}
	public void setItemprice(Float itemprice)
	{
		Itemprice = itemprice;
	}
	public Float getTotalPrice()
	{
		return totalPrice;
	}
	public void setTotalPrice(Float totalPrice)
	{
		this.totalPrice = totalPrice;
	}
		
	private Date date;
	private String name;
	private String items;
	private Float quantity;
	private String unit;
	private Float Itemprice;
	private Float totalPrice;
	public GroceryHistory(Date date, String name, String items, Float quantity, String unit, Float itemprice,
			Float totalPrice)
	{
		this.date = date;
		this.name = name;
		this.items = items;
		this.quantity = quantity;
		this.unit = unit;
		Itemprice = itemprice;
		this.totalPrice = totalPrice;
	}
	public GroceryHistory()
	{
	}
	
	
	
}
	
