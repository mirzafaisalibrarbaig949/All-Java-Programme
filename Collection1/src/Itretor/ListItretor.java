package Itretor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListItretor {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(1);
		l.add("Mirza");
		l.add("Satya");
		l.add(11);
		l.add(22);
		l.add(100);
		System.out.println("List");
		System.out.println(l);
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
		}
		l.remove("Satya");
		System.out.println(l);
	}

}
