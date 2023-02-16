package com.streamAPI;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestSort2Laptop {

	public static void main(String[] args) {
		Laptop p1=new Laptop(1,"R542uq", "Asus", 8);
		Laptop p2=new Laptop(5,"Vostro", "Dell", 2);
		Laptop p3=new Laptop(3,"Inspiration", "Dell", 16);
		Laptop p4=new Laptop(4,"Omen", "Hp", 32);
		Laptop p5=new Laptop(5,"ROG", "Asus", 64);
		Laptop p6=new Laptop(5,"ROG", "Asus", 32);

		
		
	List<Laptop> list2=List.of(p1,p2,p3,p4,p5,p6);
		
		List<Laptop>list1=list2.stream().sorted((e1,e2)->e1.getModel().compareToIgnoreCase(e2.getModel())).collect(Collectors.toList());
		list1.forEach(e->System.out.println(e));
		System.out.println(".........................................");
		List<Laptop>list3=list2.stream().sorted((e1,e2)->e1.getId().compareTo(e2.getId())).collect(Collectors.toList());
		list3.forEach(e->System.out.println(e));
	}

}
/*
 * Sorted()
 * _________
 * This Sorted method is used sort list primitive data or list of comparable type data.
 * 
 * Sorted(comparator)
 * ____________________
 * This overloded sorted accept object reference implementing class of comparator  interface on the basis of implementation of comparator .Thss method  
 * can be used sort list.of non-primitive data or list of non comparable type data.
 
 * Example Default sorted method:
 * _________________________________
 * List<Integer>list=list1.stream().sorted().collect(Collectors.toList());
	List<String>set2=list2.stream().sorted().collect(Collectors.toList());
 * 
*Example of sorted method with object reference with comparator:
*_________________________________________________________________
*List<Laptop>list1=list2.stream().sorted((e1,e2)->e1.getModel().compareTo(e2.getModel())).collect(Collectors.toList());
		list1.forEach(e->System.out.println(e)); 
*
*
*/
