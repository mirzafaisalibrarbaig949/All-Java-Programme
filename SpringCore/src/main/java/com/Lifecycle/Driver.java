package com.Lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/Lifecycle/ciconfig.xml");
		Biscuit biscuit=(Biscuit) context.getBean("item1");
		System.out.println(biscuit);
		context.registerShutdownHook();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		Pepsi pepsi=(Pepsi) context.getBean("item2");
		System.out.println(pepsi);
		
		
		Petis petis=(Petis)context.getBean("item3");
		System.out.println(petis);

	}

}
