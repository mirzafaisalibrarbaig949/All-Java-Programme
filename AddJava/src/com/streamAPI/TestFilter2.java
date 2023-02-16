package com.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class TestFilter2 {

	public static void main(String[] args) {
		Laptop p1=new Laptop(1,"R542uq", "Asus", 8);
		Laptop p2=new Laptop(2,"Vostro", "Dell", 4);
		Laptop p3=new Laptop(3,"Inspiration", "Dell", 16);
		Laptop p4=new Laptop(4,"Omen", "Hp", 32);
		Laptop p5=new Laptop(5,"ROG", "Asus", 64);
		Laptop p6=new Laptop(5,"ROG", "Asus", 32);
		Laptop p7=new Laptop(2,"Vostro", "Dell", 2);
		
		List<Laptop> list1=List.of(p1,p2,p3,p4,p5,p6,p7);
		
		
		List<Laptop> list2=(List<Laptop>) list1.stream().filter(e->e.getBrand(). length()<=5)
				.collect(Collectors.toList());
		list2.forEach(System.out::println);

	}

}
