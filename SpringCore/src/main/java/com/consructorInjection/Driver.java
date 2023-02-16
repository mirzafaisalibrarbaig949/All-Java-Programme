package com.consructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/consructorInjection/ciconfig.xml");
		
		Person p1=(Person) context.getBean("person1");
		System.out.println(p1);
		
		
		ApplicationContext context2=new ClassPathXmlApplicationContext("com/consructorInjection/ciconfig.xml");
		Person p2= (Person) context2.getBean("person2");
		System.out.println(p2);
		
		ApplicationContext context3=new ClassPathXmlApplicationContext("com/consructorInjection/ciconfig.xml");
		Addition add=(Addition) context3.getBean("sum");
		add.sum();
		
	}

}
