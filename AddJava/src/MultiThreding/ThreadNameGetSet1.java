package MultiThreding;

public class ThreadNameGetSet1 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread class excuted by : "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println("Thread class excuted by : "+Thread.currentThread().getName());
		ThreadNameGetSet1 T1=new ThreadNameGetSet1();
		T1.start();
		ThreadNameGetSet1 T2=new ThreadNameGetSet1();
		T2.start();
		System.out.println(T1.isAlive());
	}

}
