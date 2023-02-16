package com.Cloninig;

public class Car {
	int id;
	String brand;
	public Car(int id, String brand) {
		
		this.id = id;
		this.brand = brand;
	}
	public static void main(String[] args) {
		Car c=new Car(1, "Audi");
		Car c1=c;
		c1.brand="Ford";
		System.out.println(c.brand);
		
		
	}

}
