package ImplementPreparedStatement;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;
//import com.mysql.cj.xdevapi.PreparableStatement;

public class TestInsert {
public static void main(String[] args) {
	try {
		Driver driver=new Driver(); //loading driver
		DriverManager.registerDriver(driver);  //Registering Driver
		
		FileInputStream file=new FileInputStream("myDbInfo.properties");
		Properties properties=new Properties();
		properties.load(file);
		String url="jdbc:mysql://localhost:3306/firstdb";
		Connection connnection=DriverManager.getConnection(url,properties);  //Connection establish
		String query="INSERT INTO Student(sid,sname,email,age) VALUES(?,?,?,?)";
		PreparedStatement preparedStatement=connnection.prepareStatement(query);
		preparedStatement.setInt(1,5 );
		preparedStatement.setString(2, "Raju");
		preparedStatement.setString(3, "raju@gmail.com");
		preparedStatement.setInt(4,25 );
		int res=preparedStatement.executeUpdate();
		System.out.println(preparedStatement);
		System.out.println(res+"no. of rows inserted");
		preparedStatement.close();
		connnection.close();
	} catch (SQLException |IOException e) {
		e.printStackTrace();
	}
}
}
