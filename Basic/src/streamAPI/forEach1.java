package streamAPI;

import java.util.ArrayList;

import java.util.function.Consumer;


public class forEach1 {
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
		Consumer<Integer> c=(i)->{
			System.out.println("The square of number is : "+i*i);
		};
		marks.stream().forEach(c);
		marks.stream().forEach(System.out::println);

}
}
