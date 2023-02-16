package com.streamAPI;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatMap3 {

	public static void main(String[] args) {
		List<Integer>list1=List.of(2,5,8,9,54,4);
		List<Integer>list2=List.of(55,52,8,8,54,4);
		List<List<Integer>>list3=List.of(list1,list2);
		
		System.out.println(list3);
//		Using function
		Function<List<Integer>, Stream<Integer>> fun=new Function<>() {

			@Override
			public Stream<Integer> apply(List<Integer> t) {
				// TODO Auto-generated method stub
				return t.stream();
			}
			
		};
		List<Integer>list=list3.stream()
				.flatMap(fun)
				.collect(Collectors.toList());
		System.out.println(list);
		
//	Another Method	
		List<Integer>list4=list3.stream()
				.flatMap(e->e.stream())
				.collect(Collectors.toList());
		System.out.println(list4);

	}

}



