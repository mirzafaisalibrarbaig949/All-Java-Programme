package AnonymousClass;
interface Test{
	void m1();
	void m2();
}

public class Annonymousmuktiple  {
	public static void main(String[] args) {
		Test t =new Test() {
			@Override
			public void m1() {
				System.out.println("iam m1 method");
			}
			@Override
			public void m2() {
				System.out.println("I am m2 method ");
			}
		};
	}
}
