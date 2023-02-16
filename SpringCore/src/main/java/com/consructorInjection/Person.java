package com.consructorInjection;

public class Person {
	private String name;
	private int personId;
	private Certificat cert;
	

	public Person(String name, int personId ,Certificat cert) {
		super();
		this.name = name;
		this.personId = personId;
		this.cert=cert;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", cert=" + cert.name + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
