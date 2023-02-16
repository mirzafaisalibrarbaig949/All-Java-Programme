package DefaultException;

public class DefaultException {
	public static void m1() {
		System.out.println("m1 method called ");
		m2();
	}

	private static void m2() {
		System.out.println("m2 method called ");
		System.out.println(10/0);
		
		
	}

	public static void main(String[] args) {
		DefaultException.m1();
		

	}

}
