package com.spring.orm;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hibernateconfig.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Please select an operation:");
			System.out.println("1. Create");
			System.out.println("2. Retrive");
			System.out.println("3. Retrive all");
			System.out.println("4. Update");
			System.out.println("5. Delete");
			System.out.println("6. Exit");

			int option = scanner.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter id : ");
				int id=scanner.nextInt();
				System.out.println("Enter name : ");
				String name=scanner.next();
				System.out.println("Enter city : ");
				String city=scanner.next();
				
				Student student = new Student(id, name, city);
				
				int result = studentDao.insert(student);
				System.out.println("Successfully Inserted in db " + result);
				break;
			case 2:
				System.out.println("Enter id : ");
				int id3=scanner.nextInt();
				Student student1 = studentDao.getStudent(id3);
				System.out.println(student1);
				break;
			case 3:
				List<Student> student2=studentDao.getAllStudents();
				System.out.println(student2);
				break;
			
			case 4:
				System.out.println("Enter id");
				int id1=scanner.nextInt();
				System.out.println("Enter name");
				String name1=scanner.next();
				System.out.println("Enter city");
				String city1=scanner.next();
				studentDao.update(new Student(id1,name1,city1));
				System.out.println("update successfully");
				break;
			case 5:
				System.out.println("Enter id which you delete : ");
				int id2=scanner.nextInt();
				studentDao.delete(id2);
				System.out.println("delete successfully");
				break;
			case 6:
				System.out.println("Exiting program.");
				System.exit(0);
			default:
				System.out.println("Invalid option. Please try again.");
				break;
			}
		}

		// ---------Inserting---------//

		/*
		 * Student student=new Student(101,"Satya","Bhubaneswar"); int result =
		 * studentDao.insert(student);
		 * System.out.println("Successfully installed "+result);
		 */

		// ---------Retrieve a single data ---------//
		// ---------Retrieve a Multiple data ---------//
		// ---------Delete data ---------//
		// ---------Update data ---------//

	}

}
