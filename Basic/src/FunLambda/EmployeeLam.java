package FunLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
	String name;
	int id;
	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
}
public class EmployeeLam {
	public static void main(String[] args) {
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Mirza", 10122));
		l.add(new Employee("Satya", 20445));
		l.add(new Employee("Swagat", 10356));
		l.add(new Employee("Mukesh", 18368));
		l.add(new Employee("Jagadish", 12684));
		l.add(new Employee("Chinu", 28124));
		Collections.sort(l,(e1,e2)->(e1.id<e2.id)?-1:(e1.id>e2.id)?1:0);
		System.out.println("Accending order employee no.:  ");
		l.stream().forEach(System.out::println);
		
	}
	

}
