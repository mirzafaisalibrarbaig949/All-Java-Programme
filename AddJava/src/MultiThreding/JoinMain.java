package MultiThreding;

public class JoinMain extends Thread {
	static Thread th;
	public void run() {
		try {
			th.join();
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
		 th=Thread.currentThread();
		JoinMain j1=new JoinMain();
		j1.start();
		
		for (int i =1; i <=5; i++) {
			Thread.sleep(1000);
			System.out.println("Main Thread: "+i);

	}

}}
