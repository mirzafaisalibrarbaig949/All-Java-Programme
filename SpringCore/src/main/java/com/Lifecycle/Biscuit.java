package com.Lifecycle;

public class Biscuit {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Set the price");
		this.price = price;
	}

	public Biscuit() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Biscuit [price=" + price + "]";
	}
	
	public  void init() {
		System.out.println("Inside init methdo");
	}
	public  void destroy() {
		System.out.println("Inside destroy methdod");
	}
}
