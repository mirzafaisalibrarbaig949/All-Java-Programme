package MultiThreding;

public class Priority extends Thread {
	

	@Override
	public void run() {
		System.out.println("Child Thread");
		System.out.println("Child Thread Priority: "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		System.out.println("Main thread by default priority: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("After Set prority: "+Thread.currentThread().getPriority());
		
		Priority p1=new Priority();
		p1.setPriority(2);
		p1.start();

	}

}
/*
 * Priority depends on the Platform
 * Windows does not support Priority
 */
