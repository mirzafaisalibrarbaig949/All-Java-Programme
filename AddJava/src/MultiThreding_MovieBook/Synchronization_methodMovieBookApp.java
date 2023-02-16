package MultiThreding_MovieBook;

class TheaterSeatBook1{
	int total_seats=10;
	synchronized void bookSeat(int seats,String name) {
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
}

public class Synchronization_methodMovieBookApp extends Thread {
	static TheaterSeatBook1 ticket;
	int seats;
	 String s;
	public void run() {
		ticket.bookSeat(seats,s);
		
	}

	public static void main(String[] args) {
		 ticket = new TheaterSeatBook1();
		 Synchronization_methodMovieBookApp Mirza=new Synchronization_methodMovieBookApp();
		 Mirza.seats=7;
		 Mirza.s="Mirza";
		 Mirza.start();
		 
		 Synchronization_methodMovieBookApp Satya=new Synchronization_methodMovieBookApp();
		 Satya.seats=4;
		 Satya.s="Satya";
		 Satya.start();
		 
		 Synchronization_methodMovieBookApp Raju=new Synchronization_methodMovieBookApp();
		 Raju.seats=8;
		 Raju.s="Raju";
		 Raju.start();
		 
		

	}

}
