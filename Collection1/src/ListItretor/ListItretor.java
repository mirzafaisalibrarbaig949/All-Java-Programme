package ListItretor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItretor {
	@SuppressWarnings({ "unchecked", "rawtypes" })

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(1);
		l.add("Mirza");
		l.add("Satya");
		
		System.out.println(l);
		
		ListIterator li= l.listIterator();
		
//		while(li.hasNext()) {
//			System.out.println(li.next());
//		}
		li.next();
		li.next();
//		li.next();

		System.out.println("...................................");
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
//		}
//		li.add("Swagat");
//		System.out.println(l);
		li.set(200);
		System.out.println(l)  ;
//		li.remove();

}}
