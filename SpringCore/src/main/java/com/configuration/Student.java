package com.configuration;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private Pepsi pepsi;
	
	public Pepsi getPepsi() {
		return pepsi;
	}

	public void setPepsi(Pepsi pepsi) {
		this.pepsi = pepsi;
	}

	public Student(Pepsi pepsi) {
		super();
		this.pepsi = pepsi;
	}

	public void marks() {
		this.pepsi.display();
		System.out.println("pass");
	}

}
