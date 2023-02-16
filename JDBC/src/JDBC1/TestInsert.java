package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert{
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/m2e2jdbcday1","root","tiger");
			Statement smt=con.createStatement();
			smt.execute ("INSERT INTO student(id,name,course,age) VALUES (4,'Satya','PYTHON',21)");
			System.out.println("connection build successfully");
			con.close();
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
