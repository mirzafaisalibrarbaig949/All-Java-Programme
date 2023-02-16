package MultiThreding;
 class Medical extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("Medical Thread");
			Thread.sleep(1000);
			System.out.println("Medical Thread completed");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
 }
 class TestDrive extends Thread{
	 @Override
	 public void run() {
			try {
				System.out.println("Test Drive Thread");
				Thread.sleep(2000);
				System.out.println("Test Drive completed");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
 }
 class Office extends Thread{
	 @Override
	 public void run() {
		 try {
			 System.out.println("office Thread");
			 Thread.sleep(3000);
			 System.out.println("Your lincensence is completed");
		 } catch (InterruptedException e) {
			 
			 e.printStackTrace();
		 }
		 
	 }
 }

public class JoinLincenseEx {

	public static void main(String[] args) throws Exception  {
		Medical m1=new Medical();
		m1.start();
		m1.join();
		
		TestDrive t1=new TestDrive();
		t1.start();
		t1.join();
		
		Office f1=new Office();
		f1.start();

	}

}
