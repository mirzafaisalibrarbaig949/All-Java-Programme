package MultiThreding;

public class IsInterrupted1 extends Thread {
	public void run() {
//		System.out.println("A:"+Thread.interrupted());// true	-->	false
		System.out.println(Thread.currentThread().isInterrupted());//true	-->	true
		try {
		for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println("B:"+Thread.interrupted());
			} 
		}
			catch (Exception e) {
				System.out.println("Is Interrupted method excuting"+e);

			}

		
	}

	public static void main(String[] args)throws Exception {
		IsInterrupted1 s1 = new IsInterrupted1();
		s1.start();
		s1.interrupt();
		
		


	}

}
