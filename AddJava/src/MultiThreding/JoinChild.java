package MultiThreding;

public class JoinChild extends Thread {
	public void run() {
		try {
			for (int i =1; i <=5; i++) {
				Thread.sleep(1000);
				System.out.println("Child Thread: "+i);
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws Exception {
		JoinChild j1=new JoinChild();
		j1.start();
		j1.join();
		for (int i =1; i <=5; i++) {
			Thread.sleep(1000);
			System.out.println("Main Thread: "+i);

	}

}}
