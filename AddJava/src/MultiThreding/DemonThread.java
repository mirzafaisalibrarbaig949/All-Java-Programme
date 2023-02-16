package MultiThreding;

public class DemonThread extends Thread {
	

	@Override
	public void run() {
		if(Thread.currentThread().isDaemon())
		System.out.println("This Demon Thread ");
		else
			System.out.println("This Child Thread ");
	}

	public static void main(String[] args) {
		System.out.println("This is main Thread");
		//Demon thread calling
		DemonThread d1=new DemonThread();
		d1.setDaemon(true);
		d1.start();
		//child thread calling 
		DemonThread d2=new DemonThread();
		
		d2.start();
		

	}

}
