package MultiThreding_MovieBook;
class Bank extends Thread{
	static int bal=8000;
	static int withdraw;
	
	public Bank(int withdraw) {
		this.withdraw = withdraw;
	}
	public static synchronized void withdraw() {
		String name=Thread.currentThread().getName();
//		System.out.println(name);
		if(withdraw<=bal) {
			System.out.println(name+" Withdraw money successfully");
			bal-=withdraw;
		}
		else {
			System.out.println("Insufficient balance");
		}
		
	}
	@Override
	public void run() {
		withdraw();
	}
	

}

public class BankCustomer {
public static void main(String[] args) {
	
	Bank b1=new Bank(1000);
	Bank b2=new Bank(2000);
	Thread t1=new Thread(b1);
	Thread t2=new Thread(b2);
	t1.setName("Mirza");
	t2.setName("Satya");
	Bank b3=new Bank(2000);
	Bank b4=new Bank(2000);
	Thread t3=new Thread(b3);
	Thread t4=new Thread(b4);
	t3.setName("Raju");
	t4.setName("Jaga");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}
}
