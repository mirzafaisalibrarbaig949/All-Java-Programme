package com.streamAPI;

import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestDIstinct1 {

	public static void main(String[] args) {
		List<Integer>list=List.of(2, 5, 8, 6, 6, 8, 4, 2, 7, 10,54,	86,9,86);
		System.out.println(list.size());
		List<Integer>list1=list.stream().distinct().collect(Collectors.toList());
		System.out.println(list1);
		System.out.println(list1.size());

	}

}
