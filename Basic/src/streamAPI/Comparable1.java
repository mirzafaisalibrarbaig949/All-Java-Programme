package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Comparable1 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	al.add(10);
	al.add(20);
	al.add(1);
	al.add(30);
	al.add(5);
	al.add(100);
	al.add(30);
	System.out.println(al);
	List<Integer> list=al.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
	List<Integer> list1=al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
	System.out.println(list);
	System.out.println(list1);
}
}
