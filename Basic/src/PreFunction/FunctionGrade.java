package PreFunction;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int id;
	int marks;
	public Student(String name, int id, int marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	
}

public class FunctionGrade {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();		
		al.add(new Student("Mirza", 101, 65));
		al.add(new Student("Satya", 102, 85));
		al.add(new Student("Swagat", 103, 45));
		al.add(new Student("Chinu", 104, 35));
		al.add(new Student("Jaga", 108, 25));
		al.add(new Student("Ano", 203, 95));
		al.add(new Student("Amin", 100, 50));
		Function<Student, String> f=s->{
			int marks=s.marks;
			String grade="";
			if(marks>=80) grade="A-Top Class";
			else if(marks>=60) grade="B-First Class";
			else if(marks>=50) grade="C-Second Class";
			else if(marks>=35) grade="D-Third Class";
			else  grade="F- Failed ";
			return grade;
		};
		Predicate<Student> p=s->s.marks>=60;
		Consumer<Student> c=s1-> {
			System.out.println("Student Name: "+s1.name);
			System.out.println("Student Id: "+s1.id);
			System.out.println("Student Marks: "+s1.marks);
			System.out.println("Student Grade: "+f.apply(s1));
			System.out.println("...........");
			
		};
		for (Student student:al) {
			if(p.test(student)) {
			c.accept(student);
			}
		}
	}

}
