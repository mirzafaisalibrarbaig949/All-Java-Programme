package Throw_and_Throws;

public class Throw_e_Test3 {
	try {
	static ArithmeticException e =new ArithmeticException();
	}
	catch(Exception b) {
		b.printStackTrace();
	}
	public static void main(String[] args) {
		throw e;
	}
}


