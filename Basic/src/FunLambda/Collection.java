package FunLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;
public class Collection {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(1);
		al.add(30);
		al.add(5);
		al.add(100);
		al.add(30);
		System.out.println(al);
		Comparator<Integer>c=(I1,I2)->(I1<I2)?+1:(I1>I2)?-1:0;
		Collections.sort(al,c);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		al.stream().forEach(System.out::println);
		List<Integer> l= al.stream().distinct().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l);

				}
}
