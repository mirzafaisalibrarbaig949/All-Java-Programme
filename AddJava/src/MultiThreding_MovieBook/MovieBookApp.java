package MultiThreding_MovieBook;

class TheaterSeatBook{
	int total_seats=15;
	 void bookSeat(int seats,String name) {
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

public class MovieBookApp extends Thread {
	static TheaterSeatBook ticket;
	int seats;
	 String s;
	public void run() {
		ticket.bookSeat(seats,s);
		
	}

	public static void main(String[] args) {
		 ticket = new TheaterSeatBook();
		 MovieBookApp Mirza=new MovieBookApp();
		 Mirza.seats=7;
		 Mirza.s="Mirza";
		 Mirza.start();
		 
		 MovieBookApp Satya=new MovieBookApp();
		 Satya.seats=4;
		 Satya.s="Satya";
		 Satya.start();
		 
//		 MovieBookApp Raju=new MovieBookApp();
//		 Raju.seats=8;
//		 Raju.s="Raju";
//		 Raju.start();
		 
		

	}

}
