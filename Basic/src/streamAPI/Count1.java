package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Count1 {
public static void main(String[] args) {
	ArrayList<Integer> marks=new ArrayList<Integer>();
	marks.add(45);
	marks.add(55);
	marks.add(68);
	marks.add(23);
	marks.add(54);
	marks.add(44);
	marks.add(58);
	marks.add(60);
	marks.add(87);
	marks.add(34);
	marks.add(25);
	System.out.println(marks);
	System.out.println(marks.size());
	long failedStuden=marks.stream().filter(i->i>=35).count();
	System.out.println(failedStuden);
}
}
