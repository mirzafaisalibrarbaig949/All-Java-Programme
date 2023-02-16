package PreFunction;

import java.util.function.Function;

public class FunctionChanning {
	public static void main(String[] args) {
		Function<Integer, Integer> f1=i->3*i;
		Function<Integer, Integer> f2=i->i*i*i;
		System.out.println(f1.apply(2));
		System.out.println(f2.apply(2));
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
		
	}

}
