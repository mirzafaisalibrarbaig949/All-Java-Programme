package com.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/autowire/annotation/autoconfig.xml");
		
		Employee emp1=(Employee) context.getBean("emp1");
		System.out.println("Autowiering useing byName : "+emp1);

		
	

}

}