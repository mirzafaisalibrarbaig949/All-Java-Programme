package BiPreFunction;

import java.util.ArrayList;
import java.util.function.BiConsumer;



class Employee2{
	String name;
	double salary;
	public Employee2(String name, double salary) {
		super();
		this.name = name;
	
		this.salary = salary;
	}
	
}
public class BiConsumer1 {
	public static void main(String[] args) {
		ArrayList<Employee2> l=new ArrayList<Employee2>();
		populate(l);
		BiConsumer<Employee2, Double> c=(e,d)->e.salary+=d;
		for (Employee2 Employee2:l) {
		c.accept(Employee2,  500.0);
		}
		for(Employee2 Employee2:l) {
			System.out.println("Employee2 Name:"+Employee2.name);
			System.out.println("Employee2 Salary:"+Employee2.salary);
			System.out.println();
		}
		
	}

	public static void populate(ArrayList<Employee2> l) {
		l.add(new Employee2("Mirza", 10122));
		l.add(new Employee2("Satya", 20445));
		l.add(new Employee2("Swagat", 10356));
		l.add(new Employee2("Mukesh", 18368));
		l.add(new Employee2("Jagadish", 12684));
		l.add(new Employee2("Chinu", 28124));
		
		
	}

}
