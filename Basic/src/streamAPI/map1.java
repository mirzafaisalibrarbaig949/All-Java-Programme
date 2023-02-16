package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class map1 {
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
		System.out.println(marks);
		List<Integer>marks1=marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(marks1);
	}

}
