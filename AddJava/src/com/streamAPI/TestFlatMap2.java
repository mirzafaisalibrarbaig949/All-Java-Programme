package com.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatMap2 {

	public static void main(String[] args) {
		Laptop p1=new Laptop(1,"R542uq", "Asus", 8);
		Laptop p2=new Laptop(2,"Vostro", "Dell", 2);
		Laptop p3=new Laptop(3,"Inspiration", "Dell", 16);
		Laptop p4=new Laptop(4,"Omen", "Hp", 32);
		Laptop p5=new Laptop(5,"ROG", "Asus", 64);
		Laptop p6=new Laptop(5,"ROG", "Asus", 32);
		
		List<Laptop>list1=new ArrayList<>();
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		list1.add(p4);
		list1.add(p5);
		list1.add(p6);

		List<String>list=list1.stream()
				.flatMap(e->Stream.of((e.getBrand().toUpperCase()),(e.getModel().toUpperCase())))
				.collect(Collectors.toList());
			
		System.out.println(list);

	}

}
