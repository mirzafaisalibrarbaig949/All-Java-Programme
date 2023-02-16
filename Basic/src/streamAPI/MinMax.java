package streamAPI;

import java.util.ArrayList;


public class MinMax {
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
		
		marks.add(5);
		marks.add(1);
		System.out.println(marks);
		Integer minresult=marks.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(minresult);
		Integer maxresult=marks.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(maxresult);

} 
}
