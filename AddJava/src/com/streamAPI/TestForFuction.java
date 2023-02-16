package com.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestForFuction {
	public static void main(String[] args) {
		List<Integer>list1=new ArrayList<>();
		list1.add(2);
		list1.add(5);
		list1.add(6);
		list1.add(9);
		list1.add(7);
		list1.add(3);
		list1.add(18);
		Function<Integer, String>fun=new Function<Integer, String>() {

			@Override
			public String apply(Integer t) {
//				System.out.println("Square Each value: ");
				return t*t+"a";
			}
		};
		
		
//		List<Integer>list=list1.stream().map(e->e*e).collect(Collectors.toList());
//		System.out.println(list);
//		List<String>list2=list1.stream().map(e->e*e+"a").collect(Collectors.toList());
//		System.out.println(list2);
		List<String>list2=list1.stream().map(fun).collect(Collectors.toList());
		System.out.println(list2);
	}

}
//Map method:
//__________________
//Map method accept object reference of implementing class of function functional interface.One the basis of implementation of apply method from function interface we can provide or full form opration on the element
//Function interface
//Function is the functional interface from java.util.Fuction package.
//			this interface has to generates
//					1 . for input data type of the apply method 
//					2.As a return type value
//Apply method:-  Apply method is from function function interface .It is an abstract method .
//				  On the basis of data which taken as an argument of this method we can modify the return type
//									
	//
