package com.streamAPI.Movies;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class TestFilter3 {

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
		System.out.println("Movie list :  ACTION, HORROR,DOCUMENTARY,SCI-FI");
		System.out.println("Choice in integer catogory or rating ......");
		String a=sc.nextLine().toUpperCase();
            switch(a) 
            {
            case "ACTION":{
                System.out.println("Action movies list......");
                List<Movie> list2=(List<Movie>) list1.stream().filter(e->e.getCategory()=="ACTION")
                        .collect(Collectors.toList());
                        list2.forEach(System.out::println);
                        break;
                        
            }
            case "HORROR":{
                System.out.println("Action movies list......");
                List<Movie> list2=(List<Movie>) list1.stream().filter(e->e.getCategory()=="HORROR")
                        .collect(Collectors.toList());
                        list2.forEach(System.out::println);
                        break;
            }
            case "DOCUMENTARY":{
                System.out.println("Action movies list......");
                List<Movie> list2=(List<Movie>) list1.stream().filter(e->e.getCategory()=="DOCUMENTARY")
                        .collect(Collectors.toList());
                        list2.forEach(System.out::println);
                        break;
            }
            case "SCI-FI":{
                System.out.println("Action movies list......");
                List<Movie> list2=(List<Movie>) list1.stream().filter(e->e.getCategory()=="SCI-FI")
                        .collect(Collectors.toList());
                        list2.forEach(System.out::println);
                        break;
            }
            default:
            {
                System.out.println("No data in list ");
            }
		
	
	
		    }
        sc.close();
	}
	
	
}
