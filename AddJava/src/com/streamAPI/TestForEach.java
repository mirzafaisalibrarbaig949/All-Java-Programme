package com.streamAPI;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Consumer;

public class TestForEach {
	public static void main(String[] args) {
		List<Integer>list1=new ArrayList<>();
		list1.add(2);
		list1.add(5);
		list1.add(6);
		list1.add(9);
		list1.add(7);
		list1.add(3);
		list1.add(18);
//		Consumer<Integer> con=new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//				
//			}
//			
//		};
//		list1.forEach(con);
		list1.forEach(e->System.out.println(e));
		
	}

}
//FOr each
//__________________
//FOr each method is form iterable interface . Inside foreach method it has implementation of enahaced for loop.
//this method accept object reference of implementing class of consumer interface as an argument.

//Consumer InterFace
//___________________
//Consumer interface is form java.util.function package.
//it is functional interface an has one abstract method called accept().
//Accept()
//_______________________
//Accept method is form consumer interface it accept object type of data as an argument but has areturn type void.
