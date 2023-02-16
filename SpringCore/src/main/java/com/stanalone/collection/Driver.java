package com.stanalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/stanalone/collection/standconfig.xml");
		Person person1=context.getBean("person1",Person.class);
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println("-----------------------------------");
		System.out.println(person1.getFeesstructure());
		System.out.println(person1.getFeesstructure().getClass().getName());
	}
	
}
