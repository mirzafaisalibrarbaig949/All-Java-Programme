package PreFunction;

import java.util.function.Predicate;

public class Predicate1  {
	public static void main(String[] args) {
		Predicate<Integer> p=(i)->i%2==0;
		System.out.println(p.test(20));
		System.out.println(p.test(11));
	}

}
