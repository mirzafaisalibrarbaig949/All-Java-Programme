package Throw_and_Throws;

public class ThrowTest1 {

	public static void validate(int age) {  
        if(age<21) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible for Bajaj Card");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    public static void main(String args[]) {
    	try {
    		validate(13);  
    		System.out.println("rest of the code...");    
			
		} catch (Exception e) {
			System.out.println("hii");
			// TODO: handle exception
		}
  }    
} 

