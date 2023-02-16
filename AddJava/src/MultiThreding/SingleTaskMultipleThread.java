package MultiThreding;

public class SingleTaskMultipleThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Performing Single Task  from Multiple  Thread using Rnnable Interface ");

	}

	public static void main(String[] args) {
		SingleTaskMultipleThread s3=new SingleTaskMultipleThread();
		
		Thread th=new Thread(s3);
		 th.start();
		 Thread th1=new Thread(s3);
		 th1.start();
		 

	}

}
