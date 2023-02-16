package PreFunction;
import java.util.ArrayList;
import java.util.function.Predicate;
class Employee{
	String name;
	int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
}
public class PredicateEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee("Mirza",5000));
		al.add(new Employee("Satya",3000));
		al.add(new Employee("Tanmaya",2000));
		al.add(new Employee("Soubhagya",1500));
		al.add(new Employee("Swagat",6000));
		Predicate<Employee> p1=(e)->e.salary>3000;
		for(Employee e1:al) {
			if(p1.test(e1)) {
				System.out.println(e1.name+":"+e1.salary);
			}
		}
	}

}
