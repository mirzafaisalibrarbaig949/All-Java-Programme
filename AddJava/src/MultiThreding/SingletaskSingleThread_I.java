package MultiThreding;

public class SingletaskSingleThread_I implements Runnable {

	@Override
	public void run() {
		System.out.println("Performing Single Task  from Single  Thread using Rnnable Interface ");
		
	}

	public static void main(String[] args) {
		SingletaskSingleThread_I s2=new SingletaskSingleThread_I();
		
		Thread th=new Thread(s2);
		 th.start();

	}

}
