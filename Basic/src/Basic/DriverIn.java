package Basic;
@FunctionalInterface
 interface A {
	public abstract void m1();
	default void m4() {
		System.out.println("Default m4");
	}
	default void m5() {
		System.out.println("Default m5");
	}
}
class Test2 implements A{

	@Override
	public void m1() {
		System.out.println("m1 method implemented");
	}
}
public class DriverIn{
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.m4();
	}
}
