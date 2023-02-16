package FunLambda;

public class Mutilthreading {
	public static void main(String[] args) {
		Runnable rl=()->{
			for(int i=1;i<=5;i++) {
				System.out.println("Child thread-1");
			}
		};
		Thread t=new Thread(rl);
		t.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Main thread-1");
		}
	}
}
