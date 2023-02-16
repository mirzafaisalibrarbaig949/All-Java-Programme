package DefaultException;

public class DefalutException1 {
	public static void m1() {
		System.out.println("m1 method called ");
		m2();
		System.out.println(10/0);
	}

	private static void m2() {
		System.out.println("m2 method called ");
		System.out.println("Hello ");
		
		
	}

	public static void main(String[] args) {
		
		
		DefalutException1.m1();
	}

}
