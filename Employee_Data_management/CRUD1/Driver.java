package CRUD1;

import java.util.Scanner;

public class Driver {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DatabaseService databaseService=new DatabaseService();
		try {
			Scanner sc = new Scanner(System.in);
			boolean running=true;
			while (running) {			
			System.out.println("Choice opration ");
			System.out.println("1.Insert\n2.Retrive\n3.Delete\n4.Update\n5.Select employee by an id\n6.Exit\n");
			int choice = sc.nextInt();

			
			switch (choice) {
			case 1:
				System.out.println("Id,ename,email,phoneno,Job,sal,Dept_id,Address");

				databaseService.insertEmployee(new Employee(sc.nextInt(), sc.nextLine(), sc.nextLine(),sc.nextLine(), sc.nextDouble(), sc.nextInt(), sc.nextLine()));
				
				break;
			case 2:
				System.out.println(choice);
				
				break;
			case 3:
				System.out.println(choice);
				
				break;
			case 4:
				System.out.println(choice);
				
				break;
			case 5:
				System.out.println(choice);
				
				break;
			case 6:
				running=false;
				
				break;
			
				
			default:
				System.out.println(choice);
				break;
				
			}
		}
		}catch (Exception e) {
			
		}
	}

}
