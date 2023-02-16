package JDBC1;

import java.util.Arrays;

public class Test {

	

	public static void main(String[] args) {
		String test="  I am using  Java . It is a very good progarmmin language   ";
		
		String word[]=test.split(" ");
		for (String num : word)
		System.out.println(Arrays.toString(word)); 
		
		
		
		
		
//		System.out.println(test.trim());
//		int a =test.indexOf("h");
//		System.out.print(a);

	}

}
