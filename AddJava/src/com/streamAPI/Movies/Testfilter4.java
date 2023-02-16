package com.streamAPI.Movies;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class Testfilter4 {
	
	public static void main(String[] args) 
    {
		Movie m1=new Movie(1,"ABCD","Xyz","DOCUMENTARY",7.8);
		Movie m2=new Movie(2,"ABCD","Xyz","HORROR",8.8);
		Movie m3=new Movie(3,"ABCD","Xyz","ACTION",9.3);
		Movie m4=new Movie(4,"ABCD","Xyz","HORROR",4.8);
		Movie m5=new Movie(5,"ABCD","Xyz","HORROR",6.4);
		Movie m6=new Movie(6,"ABCD","Xyz","ACTION",7.2);
		Scanner sc=new Scanner(System.in);
		List<Movie> list1=List.of(m1,m2,m3,m4,m5,m6);
		System.out.println("Movie rating choice: ");
		double a=sc.nextInt();
		List<Movie> list2=(List<Movie>) list1.stream().filter(e->e.getRating()>=a)
				.collect(Collectors.toList());
		list2.forEach(System.out::println);
sc.close();
}
}