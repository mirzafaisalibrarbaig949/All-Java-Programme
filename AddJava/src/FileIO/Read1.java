package FileIO;

import java.io.File;
import java.io.FileReader;
//import java.util.stream.Stream;
//import java.io.*;

public class Read1 {

	public static void main(String[] args) {
	File file=new File("C:\\Users\\ASUS\\Desktop\\"+"pythonprojectrun.txt");
	if (file.canExecute()) {
		try {
			FileReader filreder=new FileReader(file);
			int i =0;
			while((i=filreder.read())!=-1)
			System.out.println(i);
		
			filreder.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	}

}
