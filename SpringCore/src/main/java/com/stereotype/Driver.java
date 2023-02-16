package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
	ApplicationContext context=new ClassPathXmlApplicationContext("com/stereotype/stereconfig.xml");	
						Student student=context.getBean("obj",Student.class);
						System.out.println(student);
						System.out.println(student.hashCode());
						Student student2=context.getBean("obj",Student.class);
						System.out.println(student2);
						System.out.println(student2.hashCode());
						
						Teacher t1=context.getBean("teacher",Teacher.class);
						Teacher t2=context.getBean("teacher",Teacher.class);
						System.out.println(t1.hashCode());
						System.out.println(t2.hashCode());
						
	}

}
