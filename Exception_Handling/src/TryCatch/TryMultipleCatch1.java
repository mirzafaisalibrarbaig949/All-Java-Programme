package TryCatch;

public class TryMultipleCatch1 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			System.exit(0);
			
		} catch (Exception e) {
		System.out.println("exception");
		}
	 catch (ArithmeticException e) {
		System.out.println("exception");
	}

	}

}
