package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee_Data_management {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Employee Data management\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Choice opration ");
		System.out.println("1.Insert\n2.Retrive\n3.Delete\n4.Update\n5.Exit\n");
		System.out.print("Enter your choice: ");
		int operation = sc.nextInt();

		Employee_Data_management emp = new Employee_Data_management();
		emp.CRUD(operation);

	}

	@SuppressWarnings({ "unused", "resource" })
	public void CRUD(int operation) {
		
		Scanner sc = new Scanner(System.in);
			try {
				boolean running = true;
//				while (running) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/m2e2jdbcday1", "root",
						"tiger");
				Statement smt = con.createStatement();
				switch (operation) {
				case 1:
					System.out.println("Enater value you want to insert in ()");
					String value = sc.nextLine();
					String query = ("INSERT INTO student(id,name,course,age) VALUES " + value);

					int res = smt.executeUpdate(query);
					System.out.println("no of values " + res);
					System.out.println("Insert Succefully");
					con.close();
					break;
				case 2:
					String query1 = ("Select * from Student");
					boolean result = smt.execute(query1);
					if (result) {
						ResultSet res1 = smt.getResultSet();
						System.out.println(result);
						System.out.println();

						while (res1.next()) {

							System.out.println("Id: " + res1.getInt(1));
							System.out.println("name: " + res1.getString(2));
							System.out.println("coruse: " + res1.getString(3));
							System.out.println("Age: " + res1.getInt(4));
							System.out.println("..................................");

						}
					}
					break;

				case 3:
					System.out.println("Enter delete the column name and data: ");
					String value1 = sc.nextLine();
					String query2 = ("Delete from Student where " + value1);
					int res1 = smt.executeUpdate(query2);
					System.out.println("no of values " + res1);
					System.out.println("Delete Successfully");
					con.close();
					break;

				case 4:
					System.out.println("Enter Update value ");
					System.out.println("Enter set value new value with colomn name ");
					String value2 = sc.nextLine();
					System.out.println("Enter  value old value with colomn name ");
					String value3 = sc.nextLine();
					String query3 = "UPDATE Student set " + value3 + " WHERE " + value2;
					int res2 = smt.executeUpdate(query3);
					System.out.println("no of values " + res2);
					con.close();
					break;
				case 5:
					running = false;
					break;
				default:
					System.out.println("Invalid Choice");
					break;
				}
//				}
			}
			catch (ClassNotFoundException | SQLException e) {

				e.printStackTrace();
			}

		
	}
}
