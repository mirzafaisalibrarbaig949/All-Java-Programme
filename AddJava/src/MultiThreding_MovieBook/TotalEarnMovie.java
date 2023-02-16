package MultiThreding_MovieBook;
class TotalEarning extends Thread{
	int total=0;
	public void run() {
		synchronized (this) {
		for(int i=0;i<10;i++) {
			total+=100;
		}
		
		this.notify();	
		}
		
	}
}

public class TotalEarnMovie {

	public static void main(String[] args) throws InterruptedException {
		TotalEarning te=new TotalEarning();
		te.start();
		synchronized (te) {
			te.wait();
			System.out.println("Total Earning: "+te.total+"RS");
			
		}

	}

}
