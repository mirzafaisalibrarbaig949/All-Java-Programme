package com.Cloninig;

public class Car2 implements Cloneable  {
	int id;
	String brand;
	public  Car2(int id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}
	public void display(){
		System.out.println("Id: "+id);
		System.out.println("Brand: "+brand);
	}
	public Car2 getClone(Car2 c1) {
		try {
			return (Car2)c1.clone();
		}
		catch (CloneNotSupportedException e) {
			System.err.println("wrong ");
		}
		return null;
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Car2 c=new Car2(1, "Audi");
		Car2 c1=(Car2)c.clone();
	
		c1.brand="GT-400";
//		c1.id=2;
		System.out.println("Values of car 1: ");
		c.display();
		System.out.println("Values of Car 2: ");
		c1.display();
	}

}



/*Cloning of an object: 
 * _____________________
 * Cloning refers to creating a duplicates object.
 * IN java we can clone exiting object  after 1.8 update .
 * 
 * Steps to clone an a object:
 * _____________________________
 * 1-> The class whose clone is to be created should implement cloneable interface.
 * 2-> To a create a clone of cloneable type object we need to call clone method from object class.
 * Clone():-
 * ______________
 * Clone method was added in after 1.8 update.
 * This method is used to create a clone  of cloneable type object .
 * It is a protected method with returns object type value and can throw CloneNotSupportedException.
 */
