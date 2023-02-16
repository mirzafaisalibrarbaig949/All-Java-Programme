package FunLambda;

import java.util.ArrayList;
import java.util.Collections;

class Student{
	String name;
	int id;
	public Student(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
}
public class EmployeeLam2 {
	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student("Mirza",101352));
		al.add(new Student("Satya",1780281));
		al.add(new Student("Chinu",5135154));
		al.add(new Student("Jaga",353584));
		al.add(new Student("Soubhagya",151335));
		al.add(new Student("Bunty",78965465));
		System.out.println(al);
		Collections.sort(al,(s1,s2)->(s1.name.compareTo(s2.name)));
		System.out.println(al);
		Collections.sort(al,(s1,s2)->(s1.id-(s2.id)));
		System.out.println(al);
		System.out.println(al.get(2));
	}
}
