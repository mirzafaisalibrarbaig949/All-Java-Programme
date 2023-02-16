package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read3 {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\ASUS\\Desktop\\"+"pythonprojectrun.txt");
		
		if(file.canExecute()) {
			try {
				BufferedReader reader=new BufferedReader(new FileReader(file));
				System.out.println(reader.readLine());
				reader.close();
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
		}
	}

}
