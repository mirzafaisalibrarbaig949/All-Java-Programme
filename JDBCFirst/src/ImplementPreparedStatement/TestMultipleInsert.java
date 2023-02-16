package ImplementPreparedStatement;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class TestMultipleInsert {
	public static void main(String[] args) {
		
		
		try {
			Driver driver=new Driver(); //loading driver
			DriverManager.registerDriver(driver);  //Registering Driver
			
			FileInputStream file=new FileInputStream("myDbInfo.properties");
			Properties properties=new Properties();
			properties.load(file);
			String url="jdbc:mysql://localhost:3306/firstdb";
			Connection connnection=DriverManager.getConnection(url,properties);  //Connection establish
			String query="Insert into student values(?,?,?,?)";
			PreparedStatement preparedStatement=connnection.prepareStatement(query);
			
			preparedStatement.setInt(1, 108);
			preparedStatement.setString(2, "Tanmaya");
			preparedStatement.setString(3, "tanmaya@gmail.com");
			preparedStatement.setInt(4, 24);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 109);
			preparedStatement.setString(2, "Joseph");
			preparedStatement.setString(3, "joseph@gmail.com");
			preparedStatement.setInt(4, 24);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 110);
			preparedStatement.setString(2, "Ganesh");
			preparedStatement.setString(3, "ganesh@gmail.com");
			preparedStatement.setInt(4, 22);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 111);
			preparedStatement.setString(2, "Rati");
			preparedStatement.setString(3, "rati@gmail.com");
			preparedStatement.setInt(4, 23);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 112);
			preparedStatement.setString(2, "Biju");
			preparedStatement.setString(3, "biju@gmail.com");
			preparedStatement.setInt(4, 26);
			preparedStatement.addBatch();
			
			int [] executeBatch=preparedStatement.executeBatch();
			System.out.println(executeBatch.length);
			preparedStatement.close();
			connnection.close();
			
}
		catch (SQLException |IOException e) {
			e.printStackTrace();
		}
	}
}
