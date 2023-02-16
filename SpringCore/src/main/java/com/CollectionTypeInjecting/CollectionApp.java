package com.CollectionTypeInjecting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/CollectionTypeInjecting/collectionconfig.xml");
		
				Employee emp1=(Employee) context.getBean("emp1");
				System.out.println(emp1);
	}
}
