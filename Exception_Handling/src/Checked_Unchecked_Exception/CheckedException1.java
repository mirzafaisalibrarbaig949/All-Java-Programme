package Checked_Unchecked_Exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException1 {

	public static void main(String[] args)  {
		PrintWriter pw= new PrintWriter("C:\\Users\\ASUS\\Desktop\\"+"pythonprojectrun.txt");
		pw.println("Hello");
		pw.close();

	}

}
