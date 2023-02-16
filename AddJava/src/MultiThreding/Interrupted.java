package MultiThreding;

public class Interrupted extends Thread {
	public void run() {
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
		Interrupted s1 = new Interrupted();
		s1.start();
		s1.interrupt();
		
//		Interrupted s2 = new Interrupted();
//		s2.start();


	}

}
