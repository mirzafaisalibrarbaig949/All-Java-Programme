package MultiThreding;

public class IsInterrupted extends Thread {
	public void run() {
		System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		try {
		for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			} 
		}
			catch (Exception e) {
				System.out.println("Interrupted method excuting"+e);

			}

		
	}

	public static void main(String[] args)throws Exception {
		IsInterrupted s1 = new IsInterrupted();
		s1.start();
		s1.interrupt();
		
		


	}

}
