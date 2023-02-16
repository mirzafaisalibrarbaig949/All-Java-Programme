package com.springexpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+11}")
	private int x;
	@Value("#{10*20}")
	private int y;
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private double a;
	@Value("#{ T( java.lang.Math).E }")
	private double e;
	@Value("#{new java.lang.String('Mirza')}")
	private String name;
	
	@Value("#{8>=2*4}")
	private boolean isActive;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", a=" + a + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	

	
	
	
	

}
