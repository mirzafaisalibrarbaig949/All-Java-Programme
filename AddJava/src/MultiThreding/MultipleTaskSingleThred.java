package MultiThreding;

 class Mythread1 implements Runnable{
	@Override
	public void run() {
		System.out.println("Performing  Multiple Task  from Multiple  Thread using Rnnable Interface 1");
	

	}
}
 class Mythread2 implements Runnable{
	 @Override
	 public void run() {
		 System.out.println("Performing  Multiple Task  from Multiple  Thread using Rnnable Interface 2");
		 
		 
	 }
 }

public class MultipleTaskSingleThred  {

	

	public static void main(String[] args) {
		Mythread1 m1=new Mythread1();
		Thread th1=new Thread(m1);
		th1.start();
		Mythread2 m2=new Mythread2();
		Thread th2=new Thread(m2);
		th2.start();

	}

}
