package com.Lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Petis {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public Petis() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Petis [price=" + price + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Strating method");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending method");
	}
	

}
