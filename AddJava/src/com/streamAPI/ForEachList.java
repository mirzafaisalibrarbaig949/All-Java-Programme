package com.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class ForEachList {

	public static void main(String[] args) {
		
		
		List<Integer>list1=new ArrayList<>();
		list1.add(2);
		list1.add(5);
		list1.add(6);
		list1.add(9);
		list1.add(7);
		list1.add(3);
		list1.add(18);
		List<Integer> list2 =new ArrayList<>();
		list1.forEach(e->{
			list2.add(e*e);
			
		});
		System.out.println(list2);

	}

}
