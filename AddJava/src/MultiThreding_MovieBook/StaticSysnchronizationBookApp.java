 package MultiThreding_MovieBook;

class TheaterSeatBook3{
	static int total_seats=15;
	static synchronized void bookSeat(int seats) {
		if(total_seats>=seats ) {
			System.out.println(" Seat Booking Successfully "+seats);
			total_seats-=seats;
			System.out.println("Seats Left:"+total_seats);
		}
		else {
			System.out.println("Seats Cannot be booked");
			System.out.println("Seats Left:"+total_seats);
		}
	}
}
class MyThread1 extends Thread{
	TheaterSeatBook3 b;
	int seats;
	 public MyThread1(TheaterSeatBook3 b, int seats) {
		
		this.b = b;
		this.seats = seats;
	}
	@Override
	public void run() {
		b.bookSeat(seats);
	}
	
}
class MyThread2 extends Thread{
	TheaterSeatBook3 b;
	int seats;
	public MyThread2(TheaterSeatBook3 b, int seats) {
		
		this.b = b;
		this.seats = seats;
	}
	@Override
	public void run() {
		b.bookSeat(seats);
	}
	
}

public class StaticSysnchronizationBookApp {
	public static void main(String[] args) {
		TheaterSeatBook3 b1	=new TheaterSeatBook3();
		MyThread1 m1=new MyThread1(b1, 4);
		m1.start();
		MyThread1 m2=new MyThread1(b1, 5);
		m2.start();
		
		
		TheaterSeatBook3 b2=new TheaterSeatBook3();
		MyThread1 m3=new MyThread1(b2, 3);
		m3.start();
		MyThread1 m4=new MyThread1(b2, 2);
		m4.start();
		
		 
		

	}

}
