package ArrayListSet;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListSet {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(1);
		arr.add("Mirza");
		arr.add("Satya");
		arr.add(11);
		arr.add(22);
		arr.add(100);
		System.out.println("Arraylist");
		System.out.println(arr);
		
		
		System.out.println("............................................................");
		
		
		HashSet hs =new HashSet();
		hs.add(1);
		hs.add("Satya");
		hs.add("Swagat");
		hs.add("Bunu");
		hs.add(10);
		hs.add(30);
		System.out.println("HashSet");
		System.out.println(hs);
		
		
	}

}
