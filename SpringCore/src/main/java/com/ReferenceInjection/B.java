package com.ReferenceInjection;

public class B {
	private int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public B(int y) {
		super();
		this.y = y;
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}
	

}
