package Basic;
class Test{
	public void m1() {
		System.out.println("1st m1");

	}
	public void m1(int a) {
		System.out.println("2nd m1");
		
	}
	public static void m1(char c) {
		System.out.println("3rd m1");
		
	}
	public static void m1( String s) {
		System.out.println("4th m1");
		
	}
	
}
public class Methodoverloading {
public static void main(String[] args) {
	Test t= new Test();
	t.m1();
	Test.m1('a');
	
}
public interface a {
	
}
}
