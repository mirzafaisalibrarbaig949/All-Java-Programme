package com.Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//It is work like init method
		
		System.out.println("Taking pepsi:init method");
		
	}

	@Override
	public void destroy() throws Exception {
		//It is work like destroy method
		
		System.out.println("After drinkink put the bottle on tray and paid money:destroy");
	}
	
	

}
