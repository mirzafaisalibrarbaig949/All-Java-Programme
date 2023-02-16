package com.ReferenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ReferenceInjection/Referenceconfig.xml");
		A a=(A)context.getBean("aref");
		System.out.println(a);
		System.out.println(a.getX());
		System.out.println(a.getObj().getY());
		System.out.println(a.getX()+a.getObj().getY());
		
		A a1=(A)context.getBean("aref1");
		System.out.println(a1);
		System.out.println(a1.getX());
		System.out.println(a1.getObj().getY());
		System.out.println(a1.getX()+a1.getObj().getY());
	}

}
