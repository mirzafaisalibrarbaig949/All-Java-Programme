package ImplementPreparedStatement;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class TestDelete {
	public static void main(String[] args) {
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			FileInputStream fileInputStream=new FileInputStream("myDbInfo.properties");
			Properties properties=new Properties();
			properties.load(fileInputStream);

			String url="jdbc:mysql://localhost:3306/firstdb";
			Connection connnection=DriverManager.getConnection(url,properties);
			Statement statement=connnection.createStatement();
			
			String query= ("Delete from Student where sid=?");
			PreparedStatement preparedStatement=connnection.prepareStatement(query);
			preparedStatement.setInt(1, 108);
			int res=statement.executeUpdate(query);
			System.out.println("no of values delete "+res);
			connnection.close();
		} catch (SQLException |IOException e) {
			
			e.printStackTrace();
		}
	}

}
