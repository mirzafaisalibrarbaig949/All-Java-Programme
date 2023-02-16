package Itretor;

import java.util.HashSet;
import java.util.Iterator;

public class SetIteror {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet hs =new HashSet();
		hs.add(1);
		hs.add("Satya");
		hs.add("Swagat");
		hs.add("Bunu");
		hs.add(10);
		hs.add(30); 
		System.out.println(hs);
		System.out.println("..........................");
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
