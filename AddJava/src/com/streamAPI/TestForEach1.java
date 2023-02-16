package com.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestForEach1 {
	public static void main(String[] args) {
		List<Integer>list1=new ArrayList<>();
		list1.add(2);
		list1.add(5);
		list1.add(6);
		list1.add(9);
		list1.add(7);
		list1.add(3);
		list1.add(18);	
		List<Integer>list=list1.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(list);
		List<String>list2=list1.stream().map(e->e*e+"a").collect(Collectors.toList());
		System.out.println(list2);
	}

}
