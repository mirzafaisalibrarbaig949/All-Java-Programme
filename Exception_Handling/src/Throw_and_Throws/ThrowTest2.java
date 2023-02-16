package Throw_and_Throws;

public class ThrowTest2 {


		public static void fun(){
		    try {
		        throw new NullPointerException("Demo");
		    } catch (NullPointerException e) {
		        System.out.println("Inside method fun(): ");
		        throw e;
//		        e.printStackTrace();
		    
		       
		    }
		}
		public static void main(String[] args) {
		    try {
		        fun();
		    } catch (Exception e) {
		        System.out.println("in main");
		    }
		}
		    
		}

