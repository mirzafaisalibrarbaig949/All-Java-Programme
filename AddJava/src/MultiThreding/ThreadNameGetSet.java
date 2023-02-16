package MultiThreding;
//Using Naming Method get(),set()
public class ThreadNameGetSet  {

	public static void main(String[] args) {
		System.out.println("Hello Thread");
		System.out.println(Thread.currentThread().getName());
		System.out.println(".................................");
		Thread.currentThread().setName("Mirza");
		System.out.println(Thread.currentThread().getName());
		
	}

}
