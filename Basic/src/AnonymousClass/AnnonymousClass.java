package AnonymousClass;

public class AnnonymousClass {
	public static void main(String[] args) {
		Runnable r=()->{
			for (int i = 0; i <5; i++) {
				System.out.println("Child Thread-1");
				}
		};
		Thread t=new Thread(r);
		t.start();
		for (int i = 0; i <5; i++) {
			System.out.println("Main Thread-1");
			}
	}

}
