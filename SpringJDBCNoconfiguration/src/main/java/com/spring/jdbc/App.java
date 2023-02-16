package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

public class App {
	public static void main(String[] args) {
		
		 ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
		 	//inserting
		 /*
		  StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
		 			Student student=new Student();
		 			student.setId(103);
		 	       student.setName("Tanmaya");
		 	       student.setCity("Hydrabad");
		 	       int result = studentDao.insert(student);
		 	       System.out.println("Student added in database succssfully "+result);
		 	       */ 
	/*
		//Updating
 			Student student=new Student();
			student.setId(102);
			student.setName("Soubhagya");
			student.setCity("Hydrabad");
			int result = studentDao.update(student);
			System.out.println("Data chage succefully: "+result);
			*/
		 
		/*
		 //Deleting
		 StudentDao studentDao=context.getBean("studentDao",StudentDao.class)	 ;
		
		int result=studentDao.delete(103);
		System.out.println("Delete successfully :"+result);
		*/
		 
//		 Select
		/*
		 StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
		 Student student=studentDao.getStudent(102);
		 System.out.println(student);
		 */
		 //SelectAll
		 StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
		 List<Student> students= studentDao.getAllStudents();
		 for (Student student2 : students) {
			
			 System.out.println(students);
		}
		 
	}

}
