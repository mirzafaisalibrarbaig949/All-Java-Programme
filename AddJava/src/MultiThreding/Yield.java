package MultiThreding;

public class Yield extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName() + "-" + i);
		}

	}

	public static void main(String[] args) {
		Yield y1 = new Yield();
		y1.start();
		for (int i = 1; i <= 5; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + "-" + i);
		}

	}

}
