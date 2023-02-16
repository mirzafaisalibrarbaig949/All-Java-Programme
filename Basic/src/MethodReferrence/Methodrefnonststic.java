package MethodReferrence;

public class Methodrefnonststic {
	public  void m1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}


	public static void main(String[] args) {
		Methodrefnonststic mn=new Methodrefnonststic();
		Runnable r=mn::m1;
		Thread t=new Thread(r);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
	}
}


