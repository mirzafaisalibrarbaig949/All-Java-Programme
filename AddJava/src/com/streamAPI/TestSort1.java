package com.streamAPI;
import java.util.List;
import java.util.stream.Collectors;

public class TestSort1 {
	public static void main(String[] args) {
		List<Integer> list1=List.of(2, 5, 8, 9, 54, 4);
		List<String> list2=List.of("Mirza", "Azhar", "ANil", "Satya");
		List<Integer>list=list1.stream().sorted().collect(Collectors.toList());
		List<String>set2=list2.stream().sorted().collect(Collectors.toList());
		System.out.println("Integer  Sorted: "+list);
		
		System.out.println("String Sorted: "+set2);
		
	}
	

}
