package streamAPI;

import java.util.stream.Stream;

public class StreamOf {
	public static void main(String[] args) {
		Stream<Integer> s=Stream.of(9,99,999,9999,99999,999999);
		s.forEach(System.out::println);
		
		Integer []i= {10,20,30,40,50,60};
		Stream.of(i).forEach(System.out::println);
	}	
}
