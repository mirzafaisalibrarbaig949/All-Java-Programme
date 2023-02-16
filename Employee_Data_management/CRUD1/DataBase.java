package CRUD1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	private static final String DriverPath = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/m2e2jdbcday1";
	private static final String User = "root";
	private static final String Password = "tiger";

	public  DataBase() {
		try {
			Class.forName(DriverPath);
			
					
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	public Connection getConnection() throws SQLException {
	return DriverManager.getConnection(url,User,Password);
		
		
	}

}
