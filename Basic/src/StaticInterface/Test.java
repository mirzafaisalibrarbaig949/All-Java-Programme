package StaticInterface;
interface P1{
	public static void m1() {
		System.out.println("Interface static method");
	}
}

public class Test implements P1 {
	public static void main(String[] args) {
		P1.m1();
	}
}
