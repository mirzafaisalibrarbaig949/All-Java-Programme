package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.configuration")
public class JavaConfig {
		@Bean
		public Pepsi getPepsi() {
			Pepsi pepsi=new Pepsi();
			return pepsi;
		}
	
		@Bean
		public Student getStudent() {
			Student student=new Student(getPepsi());
			return student;
		}
}
