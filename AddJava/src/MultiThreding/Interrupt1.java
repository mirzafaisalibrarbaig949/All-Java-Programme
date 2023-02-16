package MultiThreding;

public class Interrupt1 extends Thread {
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
		Interrupt1 s1 = new Interrupt1();
		s1.start();
		s1.join();
		Interrupt1 s2 = new Interrupt1();
		s2.start();
		s2.interrupt();


	}

}
