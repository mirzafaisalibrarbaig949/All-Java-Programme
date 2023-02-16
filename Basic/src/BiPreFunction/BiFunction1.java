package BiPreFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;
class Employee{
	String name;

	int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
}

public class BiFunction1 {
	
	public static void main(String[] args) {
		ArrayList<Employee>l=new ArrayList<Employee>();
		BiFunction<String, Integer, Employee> f=(name,id)->new Employee( name,id);
		l.add(f.apply("Mirza", 10122));
		l.add(f.apply("Satya", 20445));
		l.add(f.apply("Swagat", 10356));
		l.add(f.apply("Mukesh", 18368));
		l.add(f.apply("Jagadish", 12684));
		l.add(f.apply("Chinu", 28124));
		for(Employee employee:l) {
			System.out.println("Employee Name:"+employee.name);
			System.out.println("Employee Name:"+employee.id);
			System.out.println();
		}
	}

}
