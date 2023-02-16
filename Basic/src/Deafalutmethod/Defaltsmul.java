package Deafalutmethod;
interface P1{
	default void m1() {
		System.out.println("P1 methods of m1 ");
	}
}
interface P2{
	default void m1() {
		System.out.println("P2 methods of m1 ");
	}
}
public class Defaltsmul implements P1,P2 {

	@Override
	public void m1() {
		System.out.println("Own default method");
		P1.super.m1();
		P2.super.m1();
	}
public static void main(String[] args) {
	Defaltsmul dm=new Defaltsmul();
	dm.m1();
}

}
