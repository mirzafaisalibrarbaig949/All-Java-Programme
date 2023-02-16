package JDBCSecond;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class TestInsert2 {

//	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) throws ClassNotFoundException  {
		try {
			Driver driver=new Driver(); //loading driver
			DriverManager.registerDriver(driver);  //Registering Driver
			
			FileInputStream file=new FileInputStream("myDbInfo.properties");
			Properties properties=new Properties();
			properties.load(file);
			String url="jdbc:mysql://localhost:3306/firstdb";
			Connection connnection=DriverManager.getConnection(url,properties);  //Connection establish
			Statement statement=connnection.createStatement();
			
			String query="INSERT INTO Student(sid,sname,email,age) VALUES (101,'Anil','anil@gmail.com',22)";
			int res=statement.executeUpdate(query);
			System.out.println("no of rows: "+res);
			System.out.println(res);
			connnection.close();
		
   		} catch (SQLException |IOException e) {
			
			e.printStackTrace();
		}
	}
		

	}


