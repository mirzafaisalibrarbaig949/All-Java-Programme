package com.consructorInjection;

public class Certificat {
	 String name;

	public Certificat(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	public Certificat() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
