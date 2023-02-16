package TryCatch;

import java.io.IOException;

public class TryMultileCatch2 {

	public static void main(String[] args) throws IOException {
		try {
			System.out.println(10/0);
			
		}catch (ArithmeticException e) {
				System.out.println("ArithmeticException");
			}
		 catch (Exception e) {
		System.out.println("exception");
		}
	 finally {
		System.out.println("I am always exicute");
	}

	}

}
