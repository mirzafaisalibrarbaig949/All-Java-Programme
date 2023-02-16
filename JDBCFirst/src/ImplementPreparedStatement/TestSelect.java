package ImplementPreparedStatement;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

public class TestSelect {
	public static void main(String[] args) {
		
		
		try {
			Driver driver=new Driver(); //loading driver
			DriverManager.registerDriver(driver);  //Registering Driver
			
			FileInputStream file=new FileInputStream("myDbInfo.properties");
			Properties properties=new Properties();
			properties.load(file);
			String url="jdbc:mysql://localhost:3306/firstdb";
			Connection connnection=DriverManager.getConnection(url,properties);  //Connection establish
			String query=("Select * from student where sid=?");
			
			PreparedStatement preparedStatement=connnection.prepareStatement(query);
			preparedStatement.setInt(1, 101); 
			ResultSet res = preparedStatement.executeQuery();
			while(res.next()) {
				System.out.println("Id of student : "+res.getInt(1));
				System.out.println("name of student : "+res.getString(2));
				System.out.println("email of student : "+res.getString(3));
				System.out.println("age of student : "+res.getInt(4));
			}

			preparedStatement.close();
			connnection.close();

		
			
		} catch (SQLException |IOException e) {
			e.printStackTrace();
		}
	}

}
