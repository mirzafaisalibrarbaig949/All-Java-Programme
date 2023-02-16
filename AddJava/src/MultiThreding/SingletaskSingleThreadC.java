package MultiThreding;

public class SingletaskSingleThreadC extends Thread {
	

	@Override
	public void run() {
		System.out.println("Performing Single Task  from Single  Thread using Thred Class ");
	}

	public static void main(String[] args) {
		 SingletaskSingleThreadC s1=new SingletaskSingleThreadC();
		 s1.start();

	}

}
