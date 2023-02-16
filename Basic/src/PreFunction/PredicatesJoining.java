package PreFunction;

import java.util.function.Predicate;

public class PredicatesJoining {
	public static void main(String[] args) {
		int c=0;
		
		int a[] = { 5,35, 165, 16, 516, 13, 1, 84, 67, 8, 7, 9, 8, 48, 79, 88, 68, 98, 99, 77, 43, 0 };
		System.out.println(a.length);
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 12;
		// and() ,or(),negate()
		for (int x : a) {
			
			if (p1.negate().test(x)) {
				System.out.println("The numbers which are not even and greter than 12 :"+x);
			c++;
			}
			
		}
		System.out.println(c);
	}
}
