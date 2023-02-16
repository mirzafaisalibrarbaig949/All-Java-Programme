package com.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatMap1 {

	public static void main(String[] args) {
		List<Integer>list1=new ArrayList<>();
		list1.add(2);
		list1.add(5);
		list1.add(6);
		list1.add(9);
		list1.add(7);
		list1.add(3);
		list1.add(18);
		List<Integer>list=list1.stream()
				.flatMap(e->Stream.of((e*e),(e+e),(e/e),(e-e)))
				.collect(Collectors.toList());
			
		System.out.println(list);

	}

}
//Using stream .of method multiple object accepted.
//Flat amp:-
//Is method from stream api which can be use for two operation.


//1st implementation
//flatmap can be use two perform multiple operation (It can be used that multi operational map method)
//for this implementation we need configure/program flatmap as bellow.
//flatmap(e->Steram.of(operation1,opration2...........operation n).


//IN this example flatamp getting 1st element from collection object using by the help of stream method.
// that 1st element  is passed to Stream interface and by the help of() which can access multiple parameter of operation or
//parameter.The element store as stream interface will passed to is operation 
