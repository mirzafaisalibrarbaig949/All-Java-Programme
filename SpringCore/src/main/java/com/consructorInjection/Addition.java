package com.consructorInjection;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int) b;
	}
	
public void sum() {
	System.out.println("Sum os "+a+b);
}
public Addition() {
	super();
	// TODO Auto-generated constructor stub
}

}
