package MultiThreding_MovieBook;

class TheaterSeatBook2{

	int total_seats=10;
	 void bookSeat(int seats,String name) {
		System.out.println("A:"+Thread.currentThread().getName());
		System.out.println("B:"+Thread.currentThread().getName());
		System.out.println("C:"+Thread.currentThread().getName());
		System.out.println("D:"+Thread.currentThread().getName());
		System.out.println("E:"+Thread.currentThread().getName());
		
		synchronized (this) {
			if(total_seats>=seats ) {
				System.out.println(name+" Seat Booking Successfully "+seats);
				total_seats-=seats;
				System.out.println("Seats Left:"+total_seats);
			}
			else {
				System.out.println("Seats Cannot be booked");
				System.out.println("Seats Left:"+total_seats);
			}
			
		}
		System.out.println("A:"+Thread.currentThread().getName());
		System.out.println("B:"+Thread.currentThread().getName());
		System.out.println("C:"+Thread.currentThread().getName());
		System.out.println("D:"+Thread.currentThread().getName());
		System.out.println("E:"+Thread.currentThread().getName());
	}
}

public class SynchronizationBlock_methodMovieBookApp extends Thread {
	static TheaterSeatBook2 ticket;
	int seats;
	 String s;
	public void run() {
		ticket.bookSeat(seats,s);
		
	}

	public static void main(String[] args) {
		 ticket = new TheaterSeatBook2();
		 SynchronizationBlock_methodMovieBookApp Mirza=new SynchronizationBlock_methodMovieBookApp();
		 Mirza.seats=7;
		 Mirza.s="Mirza";
		 Mirza.start();
		 
		 SynchronizationBlock_methodMovieBookApp Satya=new SynchronizationBlock_methodMovieBookApp();
		 Satya.seats=4;
		 Satya.s="Satya";
		 Satya.start();
		 
//		 SynchronizationBlock_methodMovieBookApp Raju=new SynchronizationBlock_methodMovieBookApp();
//		 Raju.seats=8;
//		 Raju.s="Raju";
//		 Raju.start();
		 
		

	}

}
