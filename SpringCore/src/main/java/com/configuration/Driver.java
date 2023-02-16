package com.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/configuration/config.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student=(Student) context.getBean("getStudent");
		System.out.println(student);
		student.marks();
		
		
		
	
	}
}
