package PreFunction;

import java.util.function.Function;

public class Function2 {
	public static void main(String[] args) {
		Function<String,Integer>f =s->s.length();
		System.out.println(f.apply("Mirza"));
		System.out.println(f.apply("Soubhagya"));
		Function<String,String>f1 =s1->s1.toUpperCase();
		System.out.println(f1.apply("Mirza"));
		System.out.println(f1.apply("Soubhagya"));
	}

}
