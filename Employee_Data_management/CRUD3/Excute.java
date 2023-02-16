package CRUD3;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Excute {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.nextLine();
		String email=sc.nextLine();
		int age=sc.nextInt();
		
			try {
				Driver driver=new Driver(); //loading driver
				DriverManager.registerDriver(driver);  //Registering Driver
				FileInputStream file=new FileInputStream("myDbInfo.properties");
				
				Properties properties=new Properties();
				properties.load(file);
				String url="jdbc:mysql://localhost:3306/firstdb";
				Connection connnection=DriverManager.getConnection(url,properties);  //Connection establish
				Statement statement=connnection.createStatement();
				String query=("Select * from Student");
				String query1="INSERT INTO Student(sid,sname,email,age) VALUES ()";
				boolean res=statement.execute(query);
				boolean res1=statement.execute(query1);
				System.out.println(res);
				connnection.close();
			
	   		} catch (SQLException |IOException e) {
				
				e.printStackTrace();
			}
		}

	}


