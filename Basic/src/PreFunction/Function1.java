package PreFunction;

import java.util.function.Function;

public class Function1 {
	public static void main(String[] args) {
	Function<Integer, Integer> f=i->i*i;
	System.out.println(f.apply(8));
	System.out.println(f.apply(5));
	System.out.println(f.apply(2));
	}

}
