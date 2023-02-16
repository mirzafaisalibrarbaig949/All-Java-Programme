package FileIO;

import java.io.File;
import java.io.FileReader;

public class Reder {

	public static void main(String[] args) {
	File file=new File("C:\\Users\\ASUS\\Desktop\\"+"pythonprojectrun.txt");
	if (file.canExecute()) {
		try {
			FileReader filreder=new FileReader(file);
			int i =filreder.read();
			System.out.println((char)i);
			filreder.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	}

}
