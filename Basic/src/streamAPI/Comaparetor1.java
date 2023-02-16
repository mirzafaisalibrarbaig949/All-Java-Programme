package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Comaparetor1 {
	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("Mirza");
		l.add("Satya");
		l.add("Soubhagya");
		l.add("Tanmaya");
		l.add("Senapati");
		l.add("Sarfarajuddin");
		l.add("Azhar");
		Comparator<String> c=(s1,s2)->{
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2)return -1;
			else if (l1>l2) return +1;
			else return s1.compareTo(s2);
		};
		System.out.println(l);
		List<String> list=l.stream().sorted(c).collect(Collectors.toList());
		System.out.println(list);
	}
}
