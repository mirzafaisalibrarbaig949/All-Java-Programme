package com.springexpression;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;

import org.springframework.expression.spel.standard.SpelExpressionParser;


public class Driver {

	

	public static void main(String[] args) throws Exception {
		
			ApplicationContext context=new ClassPathXmlApplicationContext("com/springexpression/config.xml");
			

			Demo d=(Demo) context.getBean("demo");
			System.out.println(d);
			SpelExpressionParser temp=new SpelExpressionParser();
				Expression expression =temp.parseExpression("45*2");
				System.out.println(expression.getValue());
				Expression expression1 = temp.parseExpression("22+24");
				System.out.println(expression1.getValue());
				
	}

}
