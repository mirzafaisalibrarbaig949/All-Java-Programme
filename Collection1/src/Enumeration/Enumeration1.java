package Enumeration;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class Enumeration1 {
	@SuppressWarnings({ "unchecked", "rawtypes" })

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add("Mirza");
		System.out.println(v);
		Stack s=new Stack();
		s.add(10);
		s.add(20);
		s.add("Mirza");
		System.out.println(s);
		
		Enumeration e=  v.elements();
		Enumeration e1=  s.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		System.out.println();
		 Iterator i=s.iterator();  
         while(i.hasNext())  
         {  
         System.out.println(i.next());  
         } 
		

	}

}
